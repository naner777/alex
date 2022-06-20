//atividade sobre o custo de vida

package exercicio1;

import java.util.Scanner;

public class exe2 {

    public static void main(String[] orgs) {
        Scanner entrada = new Scanner(System.in);

        double salaamigo, soma1, sala, soma, aluguel, transporte, alimento, agua, luz, gas, net, med, medicamento,
                lazer, lazer1;

        System.out.println("Digite o seu aluguel: ");
        aluguel = entrada.nextDouble();

        System.out.println("gasto do transporte: ");
        transporte = entrada.nextDouble();

        System.out.println("gasto com alimentação: ");
        alimento = entrada.nextDouble();

        System.out.println("gasto da água: ");
        agua = entrada.nextDouble();

        System.out.println("gasto da luz: ");
        luz = entrada.nextDouble();

        System.out.println("gasto do gás: ");
        gas = entrada.nextDouble();

        System.out.println("gasto da internet: ");
        net = entrada.nextDouble();

        System.out.println("gasto do medico: ");
        med = entrada.nextDouble();

        System.out.println("gasto do medicamento: ");
        medicamento = entrada.nextDouble();

        System.out.println("gasto do lazer: ");
        lazer1 = entrada.nextDouble();
        lazer = lazer1 * 3;

        soma = aluguel + transporte + alimento + agua + luz + gas + net + med + medicamento + lazer;
        soma1 = aluguel + agua + luz + gas + net + lazer;
        salaamigo = (soma1 / 3) * 2;
        sala = soma * 2;

        System.out.println("o salario ideal para você é de: " + sala);
        System.out.println("o salario ideal dos seus colegas é de " + salaamigo);

    }
}
