import java.util.Scanner;

public class Diff {
    public static void main(String[] args) {
        int a, b, c, d, diff;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A, B, C e D: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diff = (a*b)-(c*d);

        System.out.println("A diferenca dos numeros eh "+diff);

        sc.close();
    }
}
