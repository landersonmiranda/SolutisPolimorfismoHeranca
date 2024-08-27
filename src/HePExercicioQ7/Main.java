package HePExercicioQ7;

import HePExercicioQ6.Funcionario;
import HePExercicioQ6.FuncionarioEB;
import HePExercicioQ6.FuncionarioEM;
import HePExercicioQ6.FuncionarioES;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando um ArrayList para armazenar os funcionários
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        // Adicionando os funcionários ao ArrayList
        funcionarios.add(new FuncionarioEB("Francisco", "424242", "Escola Doce Letra"));
        funcionarios.add(new FuncionarioEM("Paula", "38765", "Escola Comenius", "Escola Magalhães"));
        funcionarios.add(new FuncionarioES("Fabricio", "478935", "Escola Helena", "Escola Tradicao", "Universidade Católica"));
        funcionarios.add(new FuncionarioEB("Josy", "246785", "Escola São Francisco"));
        funcionarios.add(new FuncionarioEM("Pedro", "153687", "Escola Elizabeth", "Escola Kant"));
        funcionarios.add(new FuncionarioES("Carlos", "923456", "Escola Imbassay", "Escola Polivalente", "Universidade Federal da Bahia"));
        funcionarios.add(new FuncionarioEB("Fernanda", "892456", "Escola Fortunato"));
        funcionarios.add(new FuncionarioEM("Julia", "278436", "Escola Tesouro", "Escola Guerreiros"));
        funcionarios.add(new FuncionarioEM("Claudia", "423343", "Escola Educandário", "Escola Planetário"));
        funcionarios.add(new FuncionarioEB("João", "192356", "Escola Bom Jesus"));

        // Variáveis para armazenar os custos
        double custoTotal = 0.0;
        double custoEnsinoBasico = 0.0;
        double custoEnsinoMedio = 0.0;
        double custoEnsinoSuperior = 0.0;

        // Iterando sobre o ArrayList de funcionários
        for (Funcionario funcionario : funcionarios) {
            double rendaTotal = funcionario.RendaTotal();
            custoTotal += rendaTotal;

            if (funcionario instanceof FuncionarioES) {
                custoEnsinoSuperior += rendaTotal;
            } else if (funcionario instanceof FuncionarioEM) {
                custoEnsinoMedio += rendaTotal;
            } else if (funcionario instanceof FuncionarioEB) {
                custoEnsinoBasico += rendaTotal;
            }
        }

        // Exibindo os resultados
        System.out.println("Custo Total: R$ " + custoTotal);
        System.out.println("Custo com funcionários com ensino básico: R$ " + custoEnsinoBasico);
        System.out.println("Custo com funcionários com ensino médio: R$ " + custoEnsinoMedio);
        System.out.println("Custo com funcionários com ensino superior: R$ " + custoEnsinoSuperior);
    }
}
