package entities;

public class CadastrarProfessor {

        private String nome;
        private String formacaoAcademica;

        public CadastrarProfessor() {

        }

        public CadastrarProfessor(String nome, String formacaoAcademica) {
            this.nome = nome;
            this.formacaoAcademica = formacaoAcademica;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getFormacaoAcademica() {
            return formacaoAcademica;
        }

        public void setFormacaoAcademica(String formacaoAcademica) {
            this.formacaoAcademica = formacaoAcademica;
        }

        @Override
        public String toString() {
            return
                    "Nome: " + nome + '\n' +
                    "FormacaoAcademica: " + formacaoAcademica + '\n' +

                    '}';
        }


    }


