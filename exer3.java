//exercico de par e impar.

package exercicio3;

public class exer3 {

    public static void main(String[] orgs){
        long par = 1;
        int somaImpar = 0;
        int n1; 

        for (n1 = 0; n1<=30; n1++){
            if (n1 % 2 ==1){
                somaImpar+=n1;

            }else{
                if (n1>0)
                par*= n1;
            }
        }
            System.out.println("Soma dos impares" + somaImpar);
            System.out.println("multiplos dos pares" + par);

    } 
    
}
