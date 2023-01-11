package phonebook;

import java.io.*;

public class Phonebook {


    public static void main(String[] args) throws IOException {

        String act;


        Record.loadPB();

        Record.PrintPhonebook();


        System.out.println("action selection: (add) add data, (del) delete data, (num) find numbers by last name, (sur) find last name by numbers," +
                "(save) save, (exit) exit");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        act = bf.readLine();
        while(!act.equals("exit")){

            if(act.equals("add")){
                System.out.println("Enter last name:");
                String name = bf.readLine();
                System.out.println("Enter phone:");
                String phone = bf.readLine();
                Record.addPB(phone, name);
            }else{

                if(act.equals("del")){
                    System.out.println("Enter phone:");
                    String phone = bf.readLine();
                    Record.delPB(phone);
                }else{

                    if (act.equals("num")){
                        System.out.println("Enter last name:");
                        String surname = bf.readLine();
                        String[] numbers = Record.FindNumberPhone(surname);
                        for (String number : numbers) {
                            System.out.println(number);
                        }
                    } else {

                        if (act.equals("sur")) {
                            System.out.println("Enter phone:");
                            String number = bf.readLine();
                            System.out.println(Record.FindSurname(number));
                        } else {

                            if(act.equals("save")){
                                Record.savePB();
                            }
                        }
                    }
                }
            }

            System.out.println("action selection: (add) add data, (del) delete data, (num) find numbers by last name, (sur) find last name, (save) save, (exit) exit");
            act=bf.readLine();
        }
    }}
