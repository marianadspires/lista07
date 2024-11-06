public class Proprietario {
    private String nome;
    private String endereco;
    private String sexo;
    private String cpf;
    private String cnh;


    public Proprietario(String nome, String endereco, String sexo, String cpf, String cnh) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.cpf = cpf;
        this.cnh = cnh;
    }


    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Sexo: " + sexo);
        System.out.println("CPF: " + cpf);
        System.out.println("CNH: " + cnh);
    }

    public static class Veiculo {
        private String placa;
        private String cor;
        private String modelo;
        private Proprietario proprietario;


        public Veiculo(String placa, String cor, String modelo, Proprietario proprietario) {
            this.placa = placa;
            this.cor = cor;
            this.modelo = modelo;
            this.proprietario = proprietario;
        }


        public String getPlaca() {
            return placa;
        }

        public String getCor() {
            return cor;
        }

        public String getModelo() {
            return modelo;
        }

        public Proprietario getProprietario() {
            return proprietario;
        }


        public void exibirDados() {
            System.out.println("Placa: " + placa);
            System.out.println("Cor: " + cor);
            System.out.println("Modelo: " + modelo);
            System.out.println("Proprietário:");
            proprietario.exibirDados();
            System.out.println("--------------------");
        }
    }


}


