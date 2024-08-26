package HePExercicioQ8;

import HePExercicioQ9.Funcionario;
public class Vendedor extends Funcionario {

    private double comissao = 250.00;
    public Vendedor(String nome, String codigoFuncional ) {
        super(nome, codigoFuncional);
    }

    public double calcularSalarioComComissao() {
        return super.RendaTotal() + comissao;
    }
}
