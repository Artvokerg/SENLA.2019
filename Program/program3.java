import java.util.Arrays;
import java.util.Scanner;
public class program3 {

    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Введите размер массива: ");
       int n = in.nextInt();
       int mas[] = new int[n];
       System.out.println("Введите элементы массива:");
       for(int i = 0; i < n; i++){
           System.out.print("[" + i + "] = ");
           mas[i] = in.nextInt();
       }
       Arrays.sort(mas);
       System.out.println("Отсортированный массив:");
       for(int i = n - 1; i >= 0; i--)
           System.out.println(mas[i]);
    }
    
}
