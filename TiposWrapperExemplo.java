
import java.util.Scanner;

public class TiposWrapperExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de uma string representando número inteiro
        System.out.print("Digite um número inteiro: ");
        String numeroStr = scanner.nextLine();
        int numero = Integer.parseInt(numeroStr); // Uso de Integer.parseInt

        // Verifica se o número digitado é positivo
        System.out.println("O dobro do número digitado é: " + (numero * 2));

        // Entrada de um caractere
        System.out.print("Digite um caractere: ");
        char c = scanner.nextLine().charAt(0);
        if (Character.isDigit(c)) { // Uso de Character.isDigit
            System.out.println("O caractere '" + c + "' é um dígito.");
        } else {
            System.out.println("O caractere '" + c + "' não é um dígito.");
        }

        // Entrada de uma palavra
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        System.out.println("A palavra em maiúsculo é: " + palavra.toUpperCase()); // Uso de String.toUpperCase

        scanner.close();
    }
}
