import java.util.Scanner;

public class java9Nori {
    public static void main(String args[]){
        System.out.println("quantos km e quantos dias você rodou com o carro?");
        Scanner ler = new Scanner(System.in );
        double Pdia = 60;
        double Pkm = 0.15;
        double dia,km;
        dia = ler.nextDouble();
        km = ler.nextDouble();

        Pkm *=km;
        Pdia *=dia;
        double preçoT = Pdia + Pkm;
        System.out.println("o preco total é: " + preçoT);
        ler.close();

        }
    
}
