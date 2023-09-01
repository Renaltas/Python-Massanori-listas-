import java.util.Scanner;
public class Java2Nori {

    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.println("insira um numero em metros");
        double mt = ler.nextDouble();
        double ml = mt*1000;

        System.out.println("o numero de milimitros é: " + ml);

        ler.close();
        
    }
}
