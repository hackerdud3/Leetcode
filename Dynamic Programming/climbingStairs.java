import java.util.Scanner;



public class climbingStairs {
    public static int climb(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return climb(n-1)+climb(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(climb(n));
    }
}
