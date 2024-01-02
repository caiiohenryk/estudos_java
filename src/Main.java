import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num1 = myObj.nextInt();

        System.out.println("Digite outro numero: ");
        num2 = myObj.nextInt();

        int soma = num1+num2;

        System.out.println("A soma de "+num1+" + "+num2+" eh igual a "+soma);
    }
}