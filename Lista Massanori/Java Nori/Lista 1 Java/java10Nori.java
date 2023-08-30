import java.util.Scanner;

public class java10Nori {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Quantos cigarros você fuma por dia?");
        double cigarrosPorDia = ler.nextDouble();
        
        System.out.println("Há quantos anos você fuma?");
        double anosFumados = ler.nextDouble();
        
        double cigarrosTotais = cigarrosPorDia * 365 * anosFumados; // Total de cigarros fumados
        
        // Cada cigarro reduz 10 minutos de vida
        double minutosPerdidos = cigarrosTotais * 10;
        
        // Convertendo minutos para dias (1 dia = 1440 minutos)
        double diasPerdidos = minutosPerdidos / 1440;
        
        System.out.println("Dias de vida perdidos devido ao hábito de fumar: " + diasPerdidos);
        
        ler.close();

        

    }
    
}
