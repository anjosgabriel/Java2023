public class Patinete {
    // Atributos
    private String cor;
    private int tamanho;
    
    // Construtor
    public Patinete(String cor, int tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }
    
    // Métodos
    public void exibirInformacoes() {
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
    }
}

Patinete patinete = new Patinete("Azul", 10);
patinete.exibirInformacoes();