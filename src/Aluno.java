public class Aluno {
    public String nome;
    public String matricula;
    public double nota1;
    public double nota2;
    private double media;
    private String situacao;

    public Aluno() {
    }

    public void calcularMedia() {
        media = ((nota1 + nota2)/2);
    }

    public Boolean aprovado() {
        return media >= 6.0;
    }

    public String exibirBoletim() {
        
        calcularMedia();

        if (aprovado() == true) {
            situacao = "APROVADO";
        }
        else {
            situacao = "REPROVADO";
        }

        return "----------\n" + "Aluno: " + nome + " | " + matricula + "\nNota 1: " + nota1 + " | " + "Nota 2: " + nota2 + "\nMédia: " + media + "\nSituação: " + situacao;
    }
}
