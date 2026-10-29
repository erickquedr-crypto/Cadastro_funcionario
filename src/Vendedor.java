public class Vendedor extends Funcionario {
    private int bonus;
    private double comissao;
    private double INSS;
    private double imp;
    private double INSSt;

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

    public double getPagamento() {
        if (getSalario() <= 1621) {
            this.INSS = 0.075;
        } else if (getSalario() <= 2902.84) {
            this.INSS = 0.09;
        } else if (getSalario() <= 4354.27) {
            this.INSS = 0.12;
        } else if (getSalario() > 4354.27) {
            this.INSS = 0.14;
        }
        this.INSSt = getSalario() * this.INSS;
        if (this.INSSt> 988.07) {
            this.INSSt = 988.07;
        }
        if (getSalario() <= 2428.80) {
            this.imp = 0;
        } else if (getSalario() <= 2826.65) {
            this.imp = 0.075;
        } else if (getSalario() <= 375105) {
            this.imp = 0.15;
        } else if (getSalario() <= 4664.68) {
            this.imp = 0.225;
        } else if (getSalario() > 4664.68) {
            this.imp = 0.275;
        }
        return getRemuneração() - this.INSSt - (getSalario() * this.imp);
    }

    public String getFolha() {
        return "[Folha de pagamento] INSS: " + this.INSSt + "(" + this.INSS * 100 + "%) | Imposto de reda: " + getSalario() * this.imp + "(" + this.imp * 100 + "%) | Total: " + getPagamento();
    }
}