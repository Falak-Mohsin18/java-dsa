import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        boolean ans = isArmstrong(n);
        System.out.println(ans);
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        return sum == original;
    }
}
