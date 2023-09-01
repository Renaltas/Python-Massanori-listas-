import java.util.Scanner;

public class java3Nori {
    public static void main (String args[]){
        double dia ,hor,min,seg;
        Scanner ler = new Scanner(System.in );
        System.out.println("insira dias,horas,minutos e segundos");
        dia = ler.nextDouble();
        hor = ler.nextDouble();
        min = ler.nextDouble();
        seg = ler.nextDouble();

        double segT = (dia*24*60*60) + (hor*60*60) + (min*60) + seg;
        System.out.println("tudo convertido em segundo é: " + segT);


        ler.close();

    }

    
}
