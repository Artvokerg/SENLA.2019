
import java.util.Scanner;

public class program6 {

    public static void main(String[] args) {
         String s;
        System.out.print("Введите любой текст:");
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        
        
       for(int i = 0; i<s.length(); i++){
           char a=s.charAt(i);
           if(a-48<=9 && a-48>=0){
            String c = s.substring(i+1, s.length());
            s = s.substring(0, i);
            s = s.concat(c);
            i--;
           }
       }
       System.out.print("Текст без чисел: ");
       System.out.println(s);
    }
    
}
