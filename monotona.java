import java.util.Scanner;

public class monotona {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int numeroUm = read.nextInt();
        int numeroDois = read.nextInt();
        int numeroTres = read.nextInt();
        int numeroQuatro = read.nextInt();

        if ( ( (numeroUm < numeroDois) && (numeroDois < numeroTres) ) && (numeroTres < numeroQuatro)){
          System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
        }else if ( ( (numeroUm > numeroDois) && (numeroDois > numeroTres) ) && (numeroTres > numeroQuatro)){
            System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
          }else {
            System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
          }
        }
      }
