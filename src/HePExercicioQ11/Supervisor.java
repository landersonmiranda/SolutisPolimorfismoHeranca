package HePExercicioQ11;



public class Supervisor extends Funcionario {
    private double comissaoSupervisor = 600.00;
    public Supervisor(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        setComissao(comissaoSupervisor);
    }

    public double RendaTotal() {
        return super.RendaTotal() + comissaoSupervisor;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Comissão: R$ " + comissaoSupervisor + ", Salário Total: R$ " + RendaTotal();
    }

}
