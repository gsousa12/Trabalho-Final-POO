import java.util.Scanner;


public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a cifra a ser utilizada:");
        System.out.println("1. Cifra de César");
        System.out.println("2. Cifra de Vigenère");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                // Chame o método da Cifra de César aqui
                CifraDeCesar.main(args);
                break;
            case 2:
                // Chame o método da Cifra de Vigenère aqui
                CifraDeVigenere.main(args);
                break;
            default:
                System.out.println("Escolha inválida.");
                break;
        }
    }
}
