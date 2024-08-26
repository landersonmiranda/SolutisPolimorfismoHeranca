package HePExercicioQ8;

import HePExercicioQ9.Funcionario;

public class Gerente extends Funcionario {
    private double comissao = 1500.00;

    public Gerente(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
    }
    public double calcularSalarioComComissao() {
        return super.RendaTotal() + comissao;
    }

}
