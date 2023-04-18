import java.util.ArrayList;

public class Clientes extends Pessoa {
    private boolean cartãoFielidade;

    public Clientes (String nome, int idade, String cpf, String numeroCell, boolean cartãoFielidade){
        super(nome, idade, cpf, numeroCell);
        this.cartãoFielidade = cartãoFielidade;
    }

    public void setCartãoFielidade(boolean cartãoFielidade) {
        this.cartãoFielidade = cartãoFielidade;
    }
}
