import java.util.Scanner;

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }


    public double calcularDiagonal() {
        return lado * Math.sqrt(2);
    }

    public static class Teste {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor do lado do quadrado em cm: ");
            double lado = scanner.nextDouble();

            Quadrado quadrado = new Quadrado(lado);

            System.out.printf("Área: %.2f cm²%n", quadrado.calcularArea());
            System.out.printf("Perímetro: %.2f cm%n", quadrado.calcularPerimetro());
            System.out.printf("Diagonal: %.2f cm%n", quadrado.calcularDiagonal());


        }
    }

}


