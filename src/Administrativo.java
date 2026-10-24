public class Administrativo extends Funcionario {
    private String setor;
    private int gratificacao;

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
}