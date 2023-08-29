import java.util.Scanner;

public class java7Nori {
    public static void main (String args[]){
        System.out.println("digite um temperatura em celcius: ");
        Scanner ler = new Scanner(System.in);
        double c,f;
        c = ler.nextDouble();
        f =  9*c /5 + 32;

        System.out.println("a temperatura em farehigh é: " + f);




    }
    
}
