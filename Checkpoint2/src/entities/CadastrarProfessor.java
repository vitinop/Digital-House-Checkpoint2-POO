package entities;

public class CadastrarProfessor {

        //Declaração de atributos
        private String nome;
        private String formacaoAcademica;

       //Construtor padrão
        public CadastrarProfessor() {

        }


        //Construtor com sobrecarga
        public CadastrarProfessor(String nome, String formacaoAcademica) {
            this.nome = nome;
            this.formacaoAcademica = formacaoAcademica;
        }

       //Getters and Setters
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

        //Métodos Customizados
        @Override
        public String toString() {
            return'{'+
                    "Nome: " + nome + '\n' +
                    "FormacaoAcademica: " + formacaoAcademica + '\n' +
                    '}';
        }


    }


