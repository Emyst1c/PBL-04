public class Funcionario extends Pessoa {
    private String funcao;
    float salario;
    public Funcionario(String nome, int idade, String cpf, String numeroCell, String funcao,  float salario){
        super(nome,idade,cpf,numeroCell);
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}