import java.util.Scanner;

public class java10Nori {
    public static void main (String args[]){
        System.out.println("Quantos cigarros você fuma por dia?");
        Scanner ler = new Scanner(System.in);
        double cigF,anosfumados;
        cigF = ler.nextDouble();
        
        cigF *= 144;
        System.out.println("o numero de dias perdidos é: " + cigF);

        ler.close();

        

    }
    
}
