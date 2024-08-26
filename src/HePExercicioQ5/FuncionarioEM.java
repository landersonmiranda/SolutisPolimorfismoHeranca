package HePExercicioQ5;

public class FuncionarioEM extends FuncionarioEB {
    private String escola2;
    public FuncionarioEM(String nome, String codigoFuncional, String escola, String escola2) {
        super(nome, codigoFuncional, escola);
        this.escola2 = escola2;
    }

    public String getEscola2() {
        return escola2;
    }

    public void setEscola2(String escola2) {
        this.escola2 = escola2;
    }
}