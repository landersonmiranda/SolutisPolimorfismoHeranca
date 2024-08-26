package HePExercicioQ11;


public class Vendedor extends Funcionario {

    private double comissaoVendedor= 250.00;
    public Vendedor(String nome, String codigoFuncional ) {
        super(nome, codigoFuncional);
        setComissao(comissaoVendedor);
    }

    public double RendaTotal() {
        return super.RendaTotal() + comissaoVendedor;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Comissão: R$ " + comissaoVendedor + ", Salário Total: R$ " + RendaTotal();
    }
}
