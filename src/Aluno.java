import java.util.Scanner;

public class Aluno {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            System.out.println("Nota inválida! Deve estar entre 0 e 10.");
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            System.out.println("Nota inválida! Deve estar entre 0 e 10.");
        }
    }

    public double media() {
        return (nota1 + nota2) / 2;
    }

    public boolean aprovado() {
        return media() >= 7.0;
    }

    public double quantoPrecisa() {
        return (50 - media() * 6) / 4;
    }


    public class TesteAluno {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Aluno aluno = new Aluno();

            System.out.print("Informe a matrícula do aluno: ");
            aluno.setMatricula(scanner.nextInt());

            scanner.nextLine();
            System.out.print("Informe o nome do aluno: ");
            aluno.setNome(scanner.nextLine());

            System.out.print("Informe a primeira nota: ");
            aluno.setNota1(scanner.nextDouble());

            System.out.print("Informe a segunda nota: ");
            aluno.setNota2(scanner.nextDouble());


            double media = aluno.media();
            System.out.printf("Média do aluno: %.2f%n", media);


            if (aluno.aprovado()) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno reprovado.");
                double quantoPrecisa = aluno.quantoPrecisa();
                System.out.printf("O aluno precisará de %.2f no exame.%n", quantoPrecisa);
            }


        }
    }
}