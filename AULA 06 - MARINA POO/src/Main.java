import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    static ArrayList<Pessoa> pessoas = new ArrayList<>();
    static {
        pessoas.add(new Clientes("Emanuel", 36, "37494684922", "999745463", true));
        pessoas.add(new Clientes("Jonas", 26, "58208679652", "999820675", false));
        pessoas.add(new Funcionario("Simone", 27, "58532484946", "999548720", "TI", 3300));
        pessoas.add(new Funcionario("Roberto", 33, "68129453223", "999745463", "Faxineiro", 2400));
        pessoas.add(new Gerente("Fernando", 39, "85034674932", "999842023", 10, 7200));
    }
    public static void main(String[] args) {
        System.out.println("Seja muito bem-vindo ao sistema de segurança SUPER CONFIDENCIAL de Jogos Digitais");
        System.out.println("Temos as informações mais importantes de todas as pessoas >:)");
        menu();
    }
    private static void menu()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para cadastrar um novo usuário, digite '0'");
        System.out.println("Para acessar a lista de todas as pessoas cadastradas, digite '1'");
        System.out.println("Para buscar pessoas por autoridade, digite '2'.");
        System.out.println("Insira a opção desejada: \n");
        int escolha = scanner.nextInt();

        if(escolha == 0)
        {
            System.out.println("Você selecionou cadastrar uma nova pessoa.");
            System.out.println("Que cargo você quer aplicar para essa pessoa?");
            System.out.println("Para aplicar cargo de cliente, digite '0'");
            System.out.println("Para aplicar cargo de funcionário, digite '1'");
            System.out.println("Para aplicar cargo de gerente, digite '2'");
            int escolha2 = scanner.nextInt();
            if(escolha2 == 0)
            {
                crieCliente();
            }
            else if(escolha2 == 1)
            {
                crieFuncionario();
            }
            else if(escolha2 == 2)
            {
                crieGerente();
            }
        }
        else if(escolha == 1)
        {
            System.out.println("Voce selecionou listar todos os cadastrados.");
            for(Pessoa pessoa: pessoas)
            {
                if(pessoa instanceof Clientes) {
                    System.out.println("CLIENTE: ");
                } else if (pessoa instanceof Funcionario) {
                    System.out.println("FUNCIONÁRIO: ");
                } else {
                    System.out.println("GERENTE: ");
                }
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("Idade: " + pessoa.getIdade());
                System.out.println("CPF: " + pessoa.getCpf());
                System.out.println("Número: " + pessoa.getNumeroCell() + "\n");
            }
            menu();
        }
        else if(escolha == 2)
        {
            System.out.println("Voce selecionou buscar pessoas pela autoridade.\nQual autoridade você deseja que seja listada?");
            System.out.println("Para listar o cargo de cliente, digite '0'");
            System.out.println("Para listar o cargo de funcionário, digite '1'");
            System.out.println("Para listar o cargo de gerente, digite '2'");
            int escolha3 = scanner.nextInt();
            if(escolha3 == 0)
            {
                for(Pessoa pessoa: pessoas)
                {
                    if(pessoa instanceof Clientes) {
                        System.out.println("CLIENTE: ");
                        System.out.println("Nome: " + pessoa.getNome());
                        System.out.println("Idade: " + pessoa.getIdade());
                        System.out.println("CPF: " + pessoa.getCpf());
                        System.out.println("Número: " + pessoa.getNumeroCell() + "\n");
                    }
                }
                menu();
            }
            else if(escolha3 == 1)
            {
                for(Pessoa pessoa: pessoas)
                {
                    if(pessoa instanceof Funcionario) {
                        System.out.println("FUNCIONÁRIO: ");
                        System.out.println("Nome: " + pessoa.getNome());
                        System.out.println("Idade: " + pessoa.getIdade());
                        System.out.println("CPF: " + pessoa.getCpf());
                        System.out.println("Número: " + pessoa.getNumeroCell() + "\n");
                    }
                }
                menu();
            }
            else if(escolha3 == 2)
            {
                for(Pessoa pessoa: pessoas)
                {
                    if(pessoa instanceof Gerente) {
                        System.out.println("GERENTE: ");
                        System.out.println("Nome: " + pessoa.getNome());
                        System.out.println("Idade: " + pessoa.getIdade());
                        System.out.println("CPF: " + pessoa.getCpf());
                        System.out.println("Número: " + pessoa.getNumeroCell() + "\n");
                    }
                }
                menu();
            }
        }
    }
    private static void crieCliente()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do cliente:\n");
        String nome = scanner.next();
        System.out.println("Insira a idade:\n");
        int idade = scanner.nextInt();
        System.out.println("O CPF:\n");
        String cpf = scanner.next();
        System.out.println("O número de contato:\n");
        String contato = scanner.next();
        System.out.println("E se possui o cartão fidelidade:\n");
        boolean cartao = scanner.nextBoolean();
        pessoas.add(new Clientes(nome, idade, cpf, contato, cartao));
        System.out.println("Pronto!\nO cliente foi adicionado, aqui estão os dados inseridos:\n");
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf + "\nNúmero de contato: " + contato + "\nTem cartão fidelidade: " + cartao);
        menu();
    }
    private static void crieFuncionario()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do funcionário:\n");
        String nome = scanner.next();
        System.out.println("Insira a idade:\n");
        int idade = scanner.nextInt();
        System.out.println("O CPF:\n");
        String cpf = scanner.next();
        System.out.println("O número de contato:\n");
        String contato = scanner.next();
        System.out.println("Qual sua função na equipe:\n");
        String funcao = scanner.next();
        System.out.println("E seu salário:\n");
        int salario = scanner.nextInt();
        pessoas.add(new Funcionario(nome, idade, cpf, contato, funcao, salario));
        System.out.println("Pronto!\nO Funcionário foi adicionado, aqui estão os dados inseridos:\n");
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf + "\nNúmero de contato: " + contato + "\nSua função na equipe: " + funcao + "\nSeu salário: " + salario);
        menu();
    }
    private static void crieGerente()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do gerente:\n");
        String nome = scanner.next();
        System.out.println("Insira a idade:\n");
        int idade = scanner.nextInt();
        System.out.println("O CPF:\n");
        String cpf = scanner.next();
        System.out.println("O número de contato:\n");
        String contato = scanner.next();
        System.out.println("Quantos anos de experiência:\n");
        int anosExp = scanner.nextInt();
        System.out.println("E seu salário:\n");
        int salario = scanner.nextInt();
        pessoas.add(new Gerente(nome, idade, cpf, contato, anosExp, salario));
        System.out.println("Pronto!\nO Gerente foi adicionado, aqui estão os dados inseridos:\n");
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf + "\nNúmero de contato: " + contato + "\nQuantos anos de Experiência: " + anosExp + "\nSeu salário: " + salario);
        menu();
    }
}