package entities;

public class CadastrarAluno extends Turma {


        public String nome;

        public CadastrarAluno(String serieTurma, int anoTurma, String nome) {
            super(serieTurma, anoTurma);
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        @Override
        public String toString() {
            return
                    "Nome: " + nome + '\n' +
                    "SerieTurma: " + serieTurma + '\n' +
                    "AnoTurma: " + anoTurma + '\n' +
                    '}';
        }
    }

