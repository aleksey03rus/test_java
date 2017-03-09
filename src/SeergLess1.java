import java.util.Arrays;


public class SeergLess1 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int maxVes = Integer.parseInt(args[0]);
        int[] arr = new int[Integer.parseInt(args[1])];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (1 + (Math.random() * 10));
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("pogrujenElementi- ");
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] + sum) <= maxVes) {
                sum += arr[i];
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("pogrujeno " + count + "  obshiy ves= " + sum);
    }
}
