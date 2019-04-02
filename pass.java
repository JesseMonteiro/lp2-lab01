import java.util.Scanner;
import java.util.Locale; 

public class pass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        float numeroUm = sc.nextFloat();
        float numeroDois = sc.nextFloat();

        if (((numeroUm + numeroDois)/2) >= 7){
          System.out.println("pass: True!");
        }else{
          System.out.println("pass: False!");
        }

    }

}
