public class Gerente extends Pessoa{
    private int anosExp;
    private float salario;

    public Gerente(String nome, int idade, String cpf, String numeroCell, int anosExp, float salario){
        super(nome, idade, cpf,numeroCell);
        this.anosExp = anosExp;
        this.salario = salario;
    }

    public int getAnosExp() {
        return anosExp;
    }

    public void setAnosExp(int anosExp) {
        this.anosExp = anosExp;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}