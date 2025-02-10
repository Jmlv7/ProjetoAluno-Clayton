import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do aluno:");
        String nome = sc.nextLine();
        System.out.println("Digite as três notas:");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        Student aluno = new Student(nome, nota1, nota2, nota3);

        System.out.println(aluno.verificarAprovacao());

        sc.close();
    }
}
