import java.util.Arrays;
import java.util.List;

public class Methods {

    void countOccurance(List list){
        int qwe = 0;
        for (int i = 0; i < list.size(); i++) {
            if ( "qwe" == list.get(i)){
                qwe++;
            }
        }
        System.out.println(qwe);
    }
     List<Integer> toList(){

        Integer[] str = { 12, 11, 131, 14 };

        List<Integer> list = Arrays.asList(str);

        return list;
    }

    int[] findUnique(int[] numbers){
        return Arrays.stream(numbers).distinct().toArray();

    }

    void  calcOccurance(List list){
        int bird = 0;
        int fox = 0;
        int cat = 0;
        for (int i = 0; i < list.size(); i++) {
            if ( "bird" == list.get(i)){
                bird++;
            }
            if ( "fox" == list.get(i)){
                fox++;
            }
            if ( "cat" == list.get(i)){
                cat++;
            }
        }
        System.out.println("bird: "+bird+"\n"+
                "fox: "+fox+"\n"+
                "cat: "+cat+"\n");
    }

}
