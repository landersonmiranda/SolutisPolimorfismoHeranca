package HePExercicioQ9;


public class Supervisor extends Funcionario {
    private double comissaoSupervisor = 600.00;
    public Supervisor(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        setComissao(comissaoSupervisor);
    }



}
