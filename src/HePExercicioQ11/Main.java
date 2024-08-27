package HePExercicioQ11;


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

        for (int i = 0; i < funcionarios.size(); i++) {
            double rendaTotal = funcionarios.get(i).RendaTotal();
            custoTotal += rendaTotal;

            if (funcionarios.get(i) instanceof Gerente) {
                custoGerentes += rendaTotal;
            } else if (funcionarios.get(i) instanceof Supervisor) {
                custoSupervisores += rendaTotal;
            } else if (funcionarios.get(i) instanceof Vendedor) {
                custoVendedores += rendaTotal;
            }
        }

        System.out.println("Custo total: R$ " + custoTotal);
        System.out.println("Custo gerentes: R$ " + custoGerentes);
        System.out.println("Custo supervisores: R$ " + custoSupervisores);
        System.out.println("Custo vendedores: R$ " + custoVendedores);

        System.out.println("\nLista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
