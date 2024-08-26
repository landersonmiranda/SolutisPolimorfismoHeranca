package HePExercicioQ6;

public class Funcionario {
    private String nome;
    private String codigoFuncional;
    private double renda = 1000.00;
    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }
    public double RendaTotal() {
        return renda;
    }
}