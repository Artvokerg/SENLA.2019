
import java.util.Scanner;


public class program1 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int a = in.nextInt();
        Simple(a);
    }
    
    public static void Simple(int n){
        int m[] = new int [n];
        for(int i = 0; i < n; i++)
            m[i] = 1;
        
        m[1] = 0;
        for(int i = 2; i * i < n; i++){
            if(m[i] == 1){
                for(int k = i * i; k < n; k+=i){
                    m[k] = 0;
                }
            }
        }
        
        for(int i = 2; i < n; i++){
            if(m[i] == 1)
                System.out.println(i);
        }
        
    }
    
}
