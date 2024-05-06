public class Funcionario {
    // Atributos
    private String nome;
    private int idade;
    
    // Construtor
    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Métodos
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}


Funcionario funcionario = new Funcionario("Maria", 30);
funcionario.exibirInformacoes();