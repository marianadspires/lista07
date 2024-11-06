public class SistemaVeiculos {
    public static void main(String[] args) {

        Proprietario proprietario1 = new Proprietario("João Silva", "Rua A, 123", "Masculino", "123.456.789-00", "CNH123456");
        Proprietario proprietario2 = new Proprietario("Maria Oliveira", "Avenida B, 456", "Feminino", "987.654.321-00", "CNH654321");


        Proprietario.Veiculo veiculo1 = new Proprietario.Veiculo("ABC-1234", "Vermelho", "Sedan", proprietario1);
        Proprietario.Veiculo veiculo2 = new Proprietario.Veiculo("DEF-5678", "Azul", "Hatch", proprietario1);
        Proprietario.Veiculo veiculo3 = new Proprietario.Veiculo("GHI-9012", "Preto", "SUV", proprietario2);
        Proprietario.Veiculo veiculo4 = new Proprietario.Veiculo("JKL-3456", "Branco", "Caminhonete", proprietario2);
        Proprietario.Veiculo veiculo5 = new Proprietario.Veiculo("MNO-7890", "Cinza", "Conversível", proprietario1);

        System.out.println("Dados dos Veículos Cadastrados:");
        System.out.println("--------------------");
        veiculo1.exibirDados();
        veiculo2.exibirDados();
        veiculo3.exibirDados();
        veiculo4.exibirDados();
        veiculo5.exibirDados();
    }
}


