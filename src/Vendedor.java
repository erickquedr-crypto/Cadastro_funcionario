public class Vendedor extends Funcionario {
    private int bonus;
    private double comissao;

    public Vendedor(String nome, double salario, int funcionarioId, int bonus, double comissao) {
        super(nome, salario, funcionarioId);
        this.bonus = bonus;
        this.comissao = comissao;
    }
    @Override
    public String toString() {
        return "[Vendedor] " + super.toString() + " - Bonus: " + String.format("%d", bonus) + "% - Comissão: R$" +String.format("%.2f", comissao);
    }

    public double getRemuneração() {
        return getSalario() + (getSalario() * this.bonus / 100) + this.comissao;
    }


}
