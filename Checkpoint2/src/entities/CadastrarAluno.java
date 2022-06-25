package entities;

public class CadastrarAluno extends Turma {

       //Declaração de atributos
        public String nome;

        //Construtor com sobrecarga
        public CadastrarAluno(String serieTurma, int anoTurma, String nome) {
            super(serieTurma, anoTurma);
            this.nome = nome;
        }

        //Getters and Setters

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        //Métodos Customizados
        @Override
        public String toString() {
            return '{'+
                    "Nome: " + nome + '\n' +
                    "SerieTurma: " + serieTurma + '\n' +
                    "AnoTurma: " + anoTurma + '\n' +
                    '}';
        }
    }

