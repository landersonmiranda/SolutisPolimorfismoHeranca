package HePExercicioQ10;

import HePExercicioQ9.Funcionario;
import HePExercicioQ9.Gerente;
import HePExercicioQ9.Supervisor;
import HePExercicioQ9.Vendedor;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Vendedor("Claudia", "423343"));
        funcionarios.add(new Vendedor("João", "192356"));
        funcionarios.add(new Vendedor("Francisco", "424242"));
        funcionarios.add(new Gerente("Landerson", "478935"));
        funcionarios.add(new Supervisor("Paula", "38765"));
        funcionarios.add(new Supervisor("Pedro", "153687"));
        funcionarios.add(new Vendedor("Josy", "246785"));
        funcionarios.add(new Vendedor("Carlos", "923456"));
        funcionarios.add(new Vendedor("Fernanda", "892456"));
        funcionarios.add(new Vendedor("Julia", "278436"));


        double custoTotal = 0.0;
        double custoGerentes = 0.0;
        double custoSupervisores = 0.0;
        double custoVendedores = 0.0;

        // Iterando sobre o ArrayList de funcionários
        for (Funcionario funcionario : funcionarios) {
            double rendaTotal = funcionario.RendaTotal();
            custoTotal += rendaTotal;

            if (funcionario instanceof Gerente) {
                custoGerentes += rendaTotal;
            } else if (funcionario instanceof Supervisor) {
                custoSupervisores += rendaTotal;
            } else if (funcionario instanceof Vendedor) {
                custoVendedores += rendaTotal;
            }
        }

        System.out.println("Custo total: R$ " + custoTotal);
        System.out.println("Custo gerentes: R$ " + custoGerentes);
        System.out.println("Custo supervisores: R$ " + custoSupervisores);
        System.out.println("Custo vendedores: R$ " + custoVendedores);
    }
}
