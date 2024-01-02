import java.util.Scanner;

public class Raio {
    public static void main(String[] args) {
        double raio,pi, res;
        pi = 3.14159;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        raio = sc.nextDouble();

        res = pi*Math.pow(raio, 2);
        System.out.println("A area eh igual a "+res);
    }
}
