import java.util.Scanner;
import java.util.Locale;


public class Calculadora {

    public static void main(String[] args) {

      Scanner read = new Scanner(System.in);
      read.useLocale(Locale.US);

      // !objeto.metodo() && !objeto2.metodo()


      String operacao = read.next();
      if ( !(operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/") ) ){
        System.out.println("ENTRADA INVALIDA");
        System.exit(0);
      }
      float numeroUm = read.nextFloat();
      float numeroDois = read.nextFloat();
      if (operacao.equals("/") && numeroDois == 0){
        System.out.println("ERRO");
      }


      else { switch (operacao){
        case "+":
          System.out.println("RESULTADO: " + (numeroUm + numeroDois) );
          break;
        case "-":
          System.out.println("RESULTADO: " + (numeroUm - numeroDois) );
          break;
        case "/":
          System.out.println("RESULTADO: " + (numeroUm / numeroDois) );
          break;
        case "*":
          System.out.println("RESULTADO: " + (numeroUm * numeroDois) );
          break;
       }
     }
    }

  }
