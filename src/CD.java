import java.util.Scanner;

public class CD {
    private int numeroMusicasCD;
    private int faixaAtual;
    private boolean tocando;


    public CD(int numeroMusicas) {
        this.numeroMusicasCD = numeroMusicas;
        this.faixaAtual = 1;
        this.tocando = false;
    }


    public int getNumeroMusicasCD() {
        return numeroMusicasCD;
    }

    public void setNumeroMusicasCD(int numeroMusicasCD) {
        if (numeroMusicasCD > 0) {
            this.numeroMusicasCD = numeroMusicasCD;
        } else {
            System.out.println("O número de músicas deve ser maior que 0.");
        }
    }


    public int getFaixaAtual() {
        return faixaAtual;
    }

    public void setFaixaAtual(int faixaAtual) {
        if (faixaAtual >= 1 && faixaAtual <= numeroMusicasCD) {
            this.faixaAtual = faixaAtual;
        } else {
            System.out.println("Faixa inválida. Deve estar entre 1 e " + numeroMusicasCD);
        }
    }


    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    private void exibirEstado() {
        String estado = tocando ? "Tocando" : "Parado";
        System.out.println("Faixa atual: " + faixaAtual + " | Estado: " + estado);
    }


    public void play() {
        setTocando(true);
        exibirEstado();
    }


    public void pause() {
        setTocando(false);
        exibirEstado();
    }


    public void stop() {
        setTocando(false);
        setFaixaAtual(1);
        exibirEstado();
    }

    public void proximaFaixa() {
        setFaixaAtual((getFaixaAtual() % numeroMusicasCD) + 1);
        exibirEstado();
    }

    public void faixaAnterior() {
        if (getFaixaAtual() == 1) {
            setFaixaAtual(numeroMusicasCD);
        } else {
            setFaixaAtual(getFaixaAtual() - 1);
        }
        exibirEstado();
    }


    public class SimuladorCDPlayer {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o número de músicas no CD: ");
            int numeroMusicas = scanner.nextInt();

            CD cd = new CD(numeroMusicas);

            int opcao;
            do {

                System.out.println("\n--- Menu CD Player ---");
                System.out.println("1 - Play");
                System.out.println("2 - Pause");
                System.out.println("3 - Stop");
                System.out.println("4 - Próxima faixa");
                System.out.println("5 - Faixa anterior");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();


                switch (opcao) {
                    case 1:
                        cd.play();
                        break;
                    case 2:
                        cd.pause();
                        break;
                    case 3:
                        cd.stop();
                        break;
                    case 4:
                        cd.proximaFaixa();
                        break;
                    case 5:
                        cd.faixaAnterior();
                        break;
                    case 0:
                        System.out.println("Encerrando o CD Player...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 0);


        }
    }


}


