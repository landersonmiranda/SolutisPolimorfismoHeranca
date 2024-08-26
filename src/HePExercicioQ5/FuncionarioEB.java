package HePExercicioQ5;

public class FuncionarioEB extends Funcionario {
   //ensino básico
    private String escola;

    public FuncionarioEB(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
}