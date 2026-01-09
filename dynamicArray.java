import java.util.ArrayList;

public class dynamicArray {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println(arr);   // [10, 20, 30]

        arr.add(40);               // size increases
        arr.remove(1);             // removes element at index 1

        System.out.println(arr);   // [10, 30, 40]
    }
}
