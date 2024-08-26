package HePExercicioQ10;

import HePExercicioQ9.Funcionario;
import HePExercicioQ9.Gerente;
import HePExercicioQ9.Supervisor;
import HePExercicioQ9.Vendedor;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new Vendedor("Claudia", "423343");
        funcionarios[1] = new Vendedor("João", "192356");
        funcionarios[2] = new Vendedor("Fracisco", "424242");
        funcionarios[3] = new Gerente("Landerson", "478935");
        funcionarios[4] = new Supervisor("Paula", "38765");
        funcionarios[5] = new Supervisor("Pedro", "153687");
        funcionarios[6] = new Vendedor("Josy", "246785");
        funcionarios[7] = new Vendedor("Carlos", "923456");
        funcionarios[8] = new Vendedor("Fernanda", "892456");
        funcionarios[9] = new Vendedor("Julia", "278436");


        double custoTotal = 0.0;
        double custoGerentes = 0.0;
        double custoSupervisores = 0.0;
        double custoVendedores = 0.0;

        for (int i = 0; i < funcionarios.length; i++) {
            double rendaTotal = funcionarios[i].RendaTotal();
            custoTotal += rendaTotal;

            if (funcionarios[i] instanceof Gerente) {
                custoGerentes += rendaTotal;
            } else if (funcionarios[i] instanceof Supervisor) {
                custoSupervisores += rendaTotal;
            } else if (funcionarios[i] instanceof Vendedor) {
                custoVendedores += rendaTotal;
            }
        }

        System.out.println("Custo total: R$ " + custoTotal);
        System.out.println("Custo gerentes: R$ " + custoGerentes);
        System.out.println("Custo supervisores: R$ " + custoSupervisores);
        System.out.println("Custo vendedores: R$ " + custoVendedores);
    }
}
