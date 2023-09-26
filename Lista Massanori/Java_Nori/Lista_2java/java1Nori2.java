import java.util.Scanner;

public class java1Nori2{
    public static void main (String args[]){
        System.out.println("insira tres lados de um triangulo: ");
        Scanner ler = new Scanner(System.in);
        int lado1, lado2, lado3;
        lado1 = ler.nextInt();
        lado2 = ler.nextInt();
        lado3 = ler.nextInt();

        if(lado1>0 )
        if(lado1== lado2 && lado1 == lado3){
            System.out.println("triangulo equilatero...");

        }
        else if(lado1 == lado2 && lado1 != lado3){
            System.out.println("triangulo isoceles... ");
        }
        else if(lado1 != lado2 && lado1 != lado3){
            System.out.println("Triangulo escaleno...");

        }
        else{
            System.out.println("Não é triangulo");
        }
        ler.close();

    }

}