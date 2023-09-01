import java.util.Scanner;

public class desafioNori{
    public static void main (String args[]){
        System.out.println("insira a velocidade do seu carro");
        Scanner ler = new Scanner(System.in);
        int velo = ler.nextInt();
        

        if(velo > 110){
            System.out.println("Você foi muldado: ");
            int veloM = (velo - 110)*5;
            System.out.println("A sua multa é de: " + veloM);

        }
        else{ 
            System.out.println("Pode seguir");
        }

        
    }
}