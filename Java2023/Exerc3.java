public class ProdutoEletronico {
    // Atributos
    private String nome;
    private double preco;
    
    // Construtor
    public ProdutoEletronico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    // Métodos
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
    }
}


ProdutoEletronico produto = new ProdutoEletronico("Smartphone", 1999.99);
produto.exibirInformacoes();