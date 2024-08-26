package HePExercicioQ5;

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

}

