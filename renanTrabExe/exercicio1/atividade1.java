//atividade de calcular e somar dois numeros

package exercicio1;
import java.util.Scanner;

public class atividade1 {
 public static void main(String[] args) 
 { 
Scanner entrada = new Scanner(System.in);

int n1, n2, soma;

System.out.println( "digite o primeiro numero: "); 
n1 = entrada.nextInt();  

System.out.println("digite o segundo numero: ");
n2 = entrada.nextInt();

soma = n1 + n2;
System.out.println("A soma dos dois numeros digitados é de: " + soma);


}

}
