package HePExercicioQ6;


public class FuncionarioEB extends Funcionario {
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


    @Override
    public double RendaTotal() {
        return super.RendaTotal() * 1.10;
    }
}