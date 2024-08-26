package HePExercicioQ9;


public class Gerente extends Funcionario {
    private double comissaoGerente = 1500.00;

    public Gerente(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        setComissao(comissaoGerente);
    }

}
