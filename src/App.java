// Nome: Matheus Honorato Leite Teixeira
// Matrícula: 1261929133

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Matheus";
        aluno1.matricula = "1261929133";
        aluno1.nota1 = 6;
        aluno1.nota2 = 7;

        Aluno aluno2 = new Aluno();

        aluno2.nome = "Luis";
        aluno2.matricula = "1931735689";
        aluno2.nota1 = 5;
        aluno2.nota2 = 6;

        System.out.println(aluno1.exibirBoletim());
        System.out.println(aluno2.exibirBoletim());
    }
}
