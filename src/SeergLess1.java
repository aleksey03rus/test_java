

/**
 * Created by Alex on 09.03.2017.
 */
public class SeergLess1 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int maxVes =Integer.parseInt(args[0]);
        int[] arr = {4, 2, 5, 9, 6};

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] + sum) <= maxVes) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println("pogrujeno " + count + "  obshiy ves= " + sum);
    }
}
