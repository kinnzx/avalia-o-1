import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];
        double[] bimestres = new double[4];
        double[] semestres = new double[2];

        // Entrada das 8 notas
        System.out.println("Digite as 8 notas do aluno:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias bimestrais (cada bimestre = 2 notas)
        for (int i = 0; i < 4; i++) {
            bimestres[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        // Cálculo das médias semestrais
        semestres[0] = (bimestres[0] + bimestres[1]) / 2;  // 1º semestre
        semestres[1] = (bimestres[2] + bimestres[3]) / 2;  // 2º semestre

        // Cálculo da média final
        double mediaFinal = (semestres[0] + semestres[1]) / 2;

        // Saída formatada
        System.out.println("\nPráticas\n");
        System.out.printf("1o Bimestre: %.1f\n", bimestres[0]);
        System.out.printf("2o Bimestre: %.1f\n", bimestres[1]);
        System.out.printf("1o Semestre: %.1f\n", semestres[0]);
        System.out.println("----------------------");
        System.out.printf("3o Bimestre: %.1f\n", bimestres[2]);
        System.out.printf("4o Bimestre: %.1f\n", bimestres[3]);
        System.out.printf("2o Semestre: %.1f\n", semestres[1]);
        System.out.println("-----------------------");
        System.out.printf("Média Final: %.1f\n", mediaFinal);

        scanner.close();
    }
}
