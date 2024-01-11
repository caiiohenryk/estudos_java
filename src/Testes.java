import java.util.Scanner;

public class Testes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\n");
        System.out.println("SOBRECARREGANDO SEU PROCESSADOR");
        System.out.println("Que horas sao?\n");
        int horario = sc.nextInt();

        if (horario >= 5 && horario < 12) {
            System.out.println("Bom dia!");
        } else if (horario >= 12 && horario < 18) {
                System.out.println("Boa tarde");
            } else if (horario >= 18 && horario <= 24) {
                    System.out.println("Boa noite");
                } else if (horario >= 1 && horario < 5) {
                        System.out.println("Ta de madrugada hein...");
                    } else {
                            System.out.println("Horario esquisito... Nunca vi!");
        }
        for (int i = 0; i < 1000;) {
            i++;
            System.out.println("Coluna 1"+i);
            for (int j = 0; j < 1000;) {
                j++;
                System.out.println("Coluna 2 "+j);
                for (int k = 0; k < 1000;) {
                    k++;
                    System.out.println("Coluna 3 "+k);
                }
            }
        }
        System.out.println("Ok. Agora que sabemos que horas sao, vamos ao que importa:");



        sc.close();
    }
}
