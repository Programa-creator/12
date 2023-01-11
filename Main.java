import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Methods methods = new Methods();
        List<Object> list = new ArrayList<>();

        list.add("qwe");
        list.add("qwe");
        list.add("bird");
        list.add("bird");
        list.add("qwe");
        list.add("qwe");
        list.add("asd");
        list.add("fox");
        list.add("asd");
        list.add("cat");

        methods.countOccurance(list);

        System.out.println(methods.toList());

        int[] arr = {1,1,2,2,3,3};
        System.out.println(Arrays.toString(methods.findUnique(arr)));

        methods.calcOccurance(list);
    }
}
