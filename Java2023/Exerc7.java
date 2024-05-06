public class Paciente {
    // Atributos
    private String nome;
    private int idade;
    
    // Construtor
    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Métodos
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}


Paciente paciente = new Paciente("Ana", 25);
paciente.exibirInformacoes();