import java.util.Scanner;

public class java4Nori{
    public static void main (String args[]){
        System.out.println("insira o seu salario e a porcentagem do aumento");
        Scanner ler = new Scanner(System.in);
        double sal,porcaum; 
        sal = ler.nextDouble();
        porcaum = ler.nextDouble();

        porcaum = sal*(porcaum/100);
        double novsal = porcaum + sal;
        System.out.println("O valor do aumento é: " + porcaum);
        System.out.println("O novo salário é: " + novsal);
        
        
        ler.close();




    }

    

}