// Estudando while em Java, exercicios basicos :)

import java.util.Scanner;

public class While {
    /*
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        while (numero != 0) {
            System.out.println("Não é 0");
            System.out.print("Digite outro número: ");
            numero = sc.nextInt();
        }
        System.out.println("Finalmente digitou 0!");
        sc.close();

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 1;

        while (soma <= 5) {
            System.out.printf("Digite o %dª numero: ", soma);
            int x = input.nextInt();
            System.out.printf("O %d numero digitado foi %d\n", soma, x);
            soma++;
        }
        input.close();
    }
}
