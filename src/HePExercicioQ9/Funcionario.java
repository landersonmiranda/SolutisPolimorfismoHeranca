package HePExercicioQ9;

public class Funcionario {
    private String nome;
    private String codigoFuncional;
    private double renda = 1000.00;
    private double comissao;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = 0;
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

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public double RendaTotal() {
        double rendaBasica = 1000.0;
        return rendaBasica + comissao;
    }
}