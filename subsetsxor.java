import java.util.Scanner;

public class subsetsxor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int flag = 0;
        int res = 0;

        for (int i = 0; i < 1 << n; i++) {
            flag = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    flag = flag ^ arr[j];
                }
            }
            res += flag;
        }

        System.out.println(res);

    }
}