public class ContaBancaria {
    // Atributos
    private String titular;
    private double saldo;
    
    // Construtor
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    // Métodos
    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
    }
}


ContaBancaria conta = new ContaBancaria("João Silva", 1000.0);
conta.exibirInformacoes();