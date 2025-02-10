public class Student {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Student(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public String verificarAprovacao() {
        double notaFinal = notaFinal();
        if (notaFinal >= 60.0) {
            return "NOTA FINAL = " + String.format("%.2f", notaFinal) + "\nPASS";
        } else {
            double pontosFaltando = 60.0 - notaFinal;
            return "NOTA FINAL = " + String.format("%.2f", notaFinal) +
                    "\nFAILED\nFALTARAM " + String.format("%.2f", pontosFaltando) + " PONTOS";
        }
    }
}
