import java.util.Scanner;
public class program4 {

    
    public static void main(String[] args) {
        System.out.println("Введите 4 логических значения.");
        System.out.println("1 - true");
        System.out.println("0 - false");
        Scanner in = new Scanner(System.in);
        int a[] = new int[4];
        for(int i = 0; i < 4; i++){
            System.out.print((i + 1) + " = ");
            a[i] = in.nextInt();
        }
        int k = 0; //кол-во true
        
        for(int i = 0; i < 4; i++){
            if(a[i] == 1)
                k++;
        }
        
        System.out.println(k == 2);
    }
    
}
