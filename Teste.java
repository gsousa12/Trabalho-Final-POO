import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CifraDeCesar cifra = new CifraDeCesar();

        System.out.print("Digite a mensagem cifrada: ");
        String mensagemCifrada = scanner.nextLine();

        System.out.print("Digite o valor de deslocamento: ");
        int deslocamento = scanner.nextInt();

        String mensagemDecifrada = cifra.decifrar(mensagemCifrada, deslocamento);

        System.out.println("Mensagem cifrada: " + mensagemCifrada);
        System.out.println("Mensagem decifrada: " + mensagemDecifrada);

        scanner.close();
    }
}