package HePExercicioQ8;

import HePExercicioQ9.Funcionario;
public class Supervisor extends Funcionario {
    private double comissao = 600.00;
    public Supervisor(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
    }

    public double calcularSalarioComComissao() {
        return super.RendaTotal() + comissao;
    }


}
