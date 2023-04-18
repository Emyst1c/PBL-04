public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String numeroCell;

    public Pessoa(String nome, int idade, String cpf, String numeroCell){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.numeroCell = numeroCell;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNumeroCell() {
        return numeroCell;
    }
}