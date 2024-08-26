package HePExercicioQ7;

import HePExercicioQ6.Funcionario;
import HePExercicioQ6.FuncionarioEB;
import HePExercicioQ6.FuncionarioEM;
import HePExercicioQ6.FuncionarioES;


public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];
            funcionarios[0] = new FuncionarioEB("Fracisco", "424242" , "Escola Doce Letra");
            funcionarios[1] = new FuncionarioEM("Paula", "38765", "Escola Comenius", "Escola Magalhães");
            funcionarios[2] = new FuncionarioES("Fabricio", "478935", "Escola Helena", "Escola Tradicao ", "Universidade Católica");
            funcionarios[3] = new FuncionarioEB("Josy", "246785", "Escola São Francisco");
            funcionarios[4] = new FuncionarioEM("Pedro", "153687", "Escola Elizabeth", "Escola Kant ");
            funcionarios[5] = new FuncionarioES("Carlos", "923456", "Escola Imbassay", "Escola Polivalente ", "Universidade Federal da Bahia ");
            funcionarios[6] = new FuncionarioEB("Fernanda", "892456", "Escola Fortunato ");
            funcionarios[7] = new FuncionarioEM("Julia", "278436", "Escola Tesouro", "Escola Guerreiros ");
            funcionarios[8] = new FuncionarioEM("Claudia", "423343", "Escola Educandário", "Escola Planetário");
            funcionarios[9] = new FuncionarioEB("João", "192356", "Escola Bom Jesus");

        double custoTotal = 0.0;
        double custoEnsinoBasico = 0.0;
        double custoEnsinoMedio = 0.0;
        double custoEnsinoSuperior = 0.0;

        for (int i = 0; i < funcionarios.length; i++) {
            double rendaTotal = funcionarios[i].RendaTotal();
            custoTotal += rendaTotal;

            if (funcionarios[i] instanceof FuncionarioES) {
                custoEnsinoSuperior += rendaTotal;
            }else if (funcionarios[i]  instanceof FuncionarioEM) {
                custoEnsinoMedio += rendaTotal;
            }else if (funcionarios[i]instanceof FuncionarioEB) {
                custoEnsinoBasico += rendaTotal;
            }
        }
        System.out.println("Custo Total: R$ " + custoTotal);
        System.out.println("Custo com funcionários com ensino básico: R$ " + custoEnsinoBasico);
        System.out.println("Custo com funcionários com ensino médio: R$ " + custoEnsinoMedio);
        System.out.println("Custo com funcionários com ensino superior: R$ " + custoEnsinoSuperior);
    }
}
