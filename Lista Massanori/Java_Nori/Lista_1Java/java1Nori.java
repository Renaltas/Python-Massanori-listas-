 import java.util.Scanner;
 public class java1Nori {


    public static void main(String args[]){

        System.out.println("insira dois numeros inteiros");
        Scanner ler = new Scanner(System.in);
        int n1 = ler.nextInt();
        int n2 = ler.nextInt();

        int soma = n1 + n2;
        System.out.println("a soma é: " + soma);
        ler.close();

    }
   
    
}
