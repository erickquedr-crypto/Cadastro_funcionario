public class Administrativo extends Funcionario {
    private String setor;
    private int gratificacao;
    private double INSS;
    private double imp;
    private double INSSt;

    public Administrativo(String nome, double salario, int funcionarioId, String setor, int gratificacao) {
        super(nome, salario, funcionarioId);
        this.setor = setor;
        this.gratificacao = gratificacao;
    }

    @Override
    public String toString() {
        return "[Administrativo] " + super.toString() + " - Setor: " + setor + " - Gratificação: " + String.format("%d", gratificacao);
    }

    public double getRemuneração() {
        return getSalario() + this.gratificacao;
    };


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