package HePExercicioQ11;




public class Gerente extends Funcionario {
    private double comissaoGerente = 1500.00;

    public Gerente(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        setComissao(comissaoGerente);
    }
    public double RendaTotal() {
        return super.RendaTotal() + comissaoGerente;
    }
    public String toString() {
        return "Nome: " + getNome() + ", Comissão: R$ " + comissaoGerente + ", Salário Total: R$ " + RendaTotal();
    }
}
