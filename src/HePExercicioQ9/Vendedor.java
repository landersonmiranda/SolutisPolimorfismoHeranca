package HePExercicioQ9;


public class Vendedor extends Funcionario {

    private double comissaoVendedor= 250.00;
    public Vendedor(String nome, String codigoFuncional ) {
        super(nome, codigoFuncional);
        setComissao(comissaoVendedor);
    }

}
