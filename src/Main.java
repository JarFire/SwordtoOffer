import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0,1000);
        arrayList.add(0,2000);
        arrayList.add(0,3000);
        arrayList.add(0,4000);
        System.out.println(arrayList.toString());
    }
}
