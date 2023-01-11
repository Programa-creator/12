package phonebook;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Record {
    private static HashMap<String, String> pb = new HashMap<String, String>();

        static void addPB(String phone, String name) {
            pb.put(phone, name);
        }

        static void delPB(String phone) {
            pb.remove(phone);
        }

        static void savePB() throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("phone.txt")));
            for(Map.Entry<String,String> k: pb.entrySet()){
                writer.write(k.getKey() + " " + k.getValue()+System.lineSeparator());
            }
            writer.close();
        }

        public static void loadPB() throws IOException {
            File file = new File("phone.txt");
            if (file.exists()){
                BufferedReader reader = new BufferedReader(new FileReader(new File("phone.txt")));
                String act;
                while ((act=reader.readLine())!=null) {
                    String[] dat = act.split(" ");
                    pb.put(dat[0], dat[1]);
                }
                reader.close();
            }
        }

        public static void PrintPhonebook(){
            System.out.println("Phone book: ");
            for(Map.Entry<String,String> k: pb.entrySet()){
                System.out.println(k.getValue()+": "+ k.getKey());
            }
        }

        public static String FindSurname(String number){
            String result = pb.get(number);
            if (result == null) return "Can't find a subscriber with this number";
            return result;
        }

        public static String[] FindNumberPhone(String surname){
            List <String> result = new ArrayList<String>();
            for (Map.Entry entry : pb.entrySet()) {
                if (surname.equalsIgnoreCase((String)entry.getValue())){
                    result.add((String)entry.getKey());
                }
            }
            if (result.size() == 0) result.add("Can't find a subscriber with this number");
            return result.toArray(new String[0]);
        }
}
