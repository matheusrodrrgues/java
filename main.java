import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // número entre 1 e 100
        int tentativa;
        int tentativasRestantes = 7;

        System.out.println("=== Jogo de Adivinhação ===");
        System.out.println("Tente adivinhar o número entre 1 e 100.");
        System.out.println("Você tem " + tentativasRestantes + " tentativas.");

        while (tentativasRestantes > 0) {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();

            if (tentativa == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número!");
                break;
            } else if (tentativa < numeroSecreto) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }

            tentativasRestantes--;

            if (tentativasRestantes == 0) {
                System.out.println("Suas tentativas acabaram! O número era " + numeroSecreto + ".");
            } else {
                System.out.println("Tentativas restantes: " + tentativasRestantes);
            }
        }

        scanner.close();
    }
}
