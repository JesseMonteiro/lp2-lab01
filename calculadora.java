import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

      Scanner read = new Scanner(System.in);

      String operacao = read.next();
      float numeroUm = read.nextFloat();
      float numeroDois = read.nextFloat();

      switch (operacao){
        case "+":
          System.out.println(numeroUm + numeroDois);
          break;
        case "-":
          System.out.println(numeroUm - numeroDois);
          break;
        case "/":
          System.out.println(numeroUm / numeroDois);
          break;
        case "*":
          System.out.println(numeroUm * numeroDois);
          break;
      }
    }
  }
