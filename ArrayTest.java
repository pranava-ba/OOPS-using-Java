import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
    int[] sampleArray = new int[10];
    sampleArray[0] = 1;
    sampleArray[1] = 2;
    sampleArray[2] = 83;
    String x=Arrays.toString(sampleArray);
    System.out.println(sampleArray);
    System.out.println(x);
    //printing sampleArray[8] or such which are not filled in yet, will return 0
    int[] numbers = {1,21,3,4,5,6};
    numbers[0]=110;
    System.out.println(numbers);
    System.out.println(Arrays.toString(numbers));
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));
    int[][] array = new int[3][3];
    int[][] array2 = {{1,2,3},{4}};
    array2[1][0]=3;
    array[0][0] = 1;
    System.out.println(Arrays.deepToString((array)));
    System.out.println(Arrays.deepToString(array2));
    final float PI=3.14F;
    //final constants are typed in full caps
        }
}
