
import java.util.Scanner;


public class program2 {

    public static void main(String[] args) {
        int n, b = 1;
        System.out.println("Введите число N");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int number = 1;
        while(b <= n){
            b = fib(number);
            if(b > n)
                break;
            System.out.println(b);
            number++;
        }
        
    }
    public static int fib(int n){
        if(n == 1 || n==2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
    
}
