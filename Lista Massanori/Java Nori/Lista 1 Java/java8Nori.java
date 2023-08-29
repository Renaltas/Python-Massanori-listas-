import java.util.Scanner;

public class java8Nori {
    public static void main (String args[]){
        System.out.println("insira a temperatura em firehigh: ");
        double c,f;
        Scanner ler = new Scanner(System.in);
        f= ler.nextDouble();
        c = (f-32)/1.8;

        System.out.println("a temperatura em celcius é: " + c);
        ler.close();

        
    }
    
}
