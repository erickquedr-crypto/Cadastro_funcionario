public class Funcionario {
    private String nome;
    private double salario;
    private int funcionarioId;

    public Funcionario(String nome, double salario, int funcionarioId) {
        this.nome = nome;
        this.salario = salario;
        this.funcionarioId = funcionarioId;
    }

    public Funcionario() {
    }


    public int getFuncionarioId() {
        return this.funcionarioId;
    }
    public String getNome() {
        return  this.nome;
    }
    public double getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return "ID: " + String.format("%d", funcionarioId) + " - Nome: " + nome + " - Salario: R$" + String.format("%.2f", salario);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public double getRemuneração() {
        return getRemuneração();
    }

    public double getPagamento() {return getPagamento();}

    public String getFolha() {
        return getFolha();
    }
}