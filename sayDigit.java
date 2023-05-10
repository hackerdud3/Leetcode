import java.util.Scanner;

public class sayDigit {

    private static void say(int n) {
        
        if(n==0){
            
            return;
       
        }
       String[] arr = new String[] {"zero", "one", "two","three","four","five","six","seven","eight","nine"};
       int digit = n % 10;
       n/=10;
       say(n);
       System.out.println(arr[digit] + " ");
       

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
       say(n);
        
    }

   
}
