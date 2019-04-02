import java.util.Scanner;

public class AcimaMedia {

    public static void main(String[] args) {

      Scanner read = new Scanner(System.in);

      String[] lista = read.nextLine().split(" ");

      int tam = lista.length;
      double media = 0;
    //  System.out.println(lista + tam);
      for (int i = 0 ; i < tam ; i++ ){
        media += Integer.parseInt(lista[i]);
      }
      media = media/tam;

      String saida = "";

      for(int i = 0; i < tam ; i++){

        if (Integer.parseInt(lista[i]) > media){
            saida += (lista[i] + " ");
        }
      }

      System.out.println(saida);
    }
  }
