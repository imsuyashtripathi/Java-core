
import java.util.Arrays;


public class SortArrays {

    public static void main(String arga[]){
        int[] array={101,201,10,22};
        System.out.println("Array before sort");
        for(int elem:array)
        {
            System.out.println(elem);
        }
        Arrays.sort(array);
        System.out.println("Array after the sort:");
        for(int elem:array)
        {
            System.out.println(elem);
        }
    }
}
