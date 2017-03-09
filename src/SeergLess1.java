

/**
 * Created by Alex on 09.03.2017.
 */
public class SeergLess1 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int maxVes = 16;
        int arrLength = 5;
        int[] arr = {4, 2, 2, 9, 6};

        for (int i = 0; i < arrLength; i++) {
            if ((arr[i] + sum) <= maxVes) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println("pogrujeno " + count + "  obshiy ves =" + sum);
    }
}
