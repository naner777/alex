//calcular a area

package exercicio1;

import java.util.Scanner;
public class exe3 {
  
    public static void main(String[] orgs) {
        Scanner entrada = new Scanner(System.in);

    double n1, n2, n3, n4;

    System.out.println("valor da altura:");
    n1 = entrada.nextDouble();

    System.out.println("valor da base menor: ");
    n2 = entrada.nextDouble();

    System.out.println("valor da base maior: ");
    n3 = entrada.nextDouble();

    n4 = (n1*(n2 + n3)) / 2;

    System.out.println("o valor da área é de: " + n4 );

}
}