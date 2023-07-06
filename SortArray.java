import java.util.Arrays;
public class SortArray
{
    public static void main(String []args)
    {
        int numbers[] = {23, 13, 48, -18, 75};
        //Sort Array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: "+ Arrays.toString(numbers));
    }
}
