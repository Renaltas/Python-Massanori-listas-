import java.util.Scanner;

public class java6Nori {
    public static void main (String args[]){
        System.out.println("qual a distancia e a velocidade?");
        double dist,velo;
        Scanner ler = new Scanner(System.in);
        dist = ler.nextDouble();
        velo = ler.nextDouble();

        double tempo = dist/velo;
        System.out.println("o tempo é: " + tempo);
        ler.close();
    }
    
}
