public class Aviao {
    // Atributos
    private String modelo;
    private int capacidade;
    
    // Construtor
    public Aviao(String modelo, int capacidade) {
        this.modelo = modelo;
        this.capacidade = capacidade;
    }
    
    // Métodos
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade: " + capacidade);
    }
}

Aviao aviao = new Aviao("Boeing 737", 200);
aviao.exibirInformacoes();
