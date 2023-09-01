import java.util.Scanner;

public class java5Nori {
    public static void main (String args[]){

        System.out.println("Qual o preço e o desconto: ");
        Scanner ler = new Scanner(System.in);
        double preço,desconto;
        preço = ler.nextDouble();
        desconto = ler.nextDouble();


         desconto = preço*(desconto/100);
         preço = preço - desconto;

         System.out.println("o preco: " + preço);
         System.out.println("o desconto é: " + desconto);

         ler.close();
    }
}
