public class Cliente {
    // Atributos
    private String nome;
    private String endereco;
    private String telefone;
    
    // Construtor
    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    // Métodos
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}

Cliente cliente = new Cliente("João", "Rua A, 123", "(99) 9999-9999");
cliente.exibirInformacoes();
