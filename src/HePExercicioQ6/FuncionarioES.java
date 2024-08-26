package HePExercicioQ6;


public class FuncionarioES extends FuncionarioEM {
        private String universidade;

        public FuncionarioES(String nome, String codigoFuncional, String escola, String escola2, String universidade) {
            super(nome, codigoFuncional, escola, escola2);
            this.universidade = universidade;
        }

        public String getUniversidade() {
            return universidade;
        }

        public void setUniversidade(String universidade) {
            this.universidade = universidade;
        }


        @Override
        public double RendaTotal() {
        return super.RendaTotal() * 2.00; // 100% a mais
        }
}

