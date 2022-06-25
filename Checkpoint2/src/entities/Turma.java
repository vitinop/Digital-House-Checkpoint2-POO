package entities;

public abstract class Turma{

    //declaração de atributos
    public String serieTurma;
    public int anoTurma;


    public Turma() {
    }

    // Constructor com sobrecarga
    public Turma(String serieTurma, int anoTruma) {
        this.serieTurma = serieTurma;
        this.anoTurma = anoTruma;
    }

    //Getters and Setters

    public String getSerieTurma() {
        return serieTurma;
    }

    public void setSerieTurma(String serieTurma) {
        this.serieTurma = serieTurma;
    }

    public int getAnoTruma() {
        return anoTurma;
    }

    public void setAnoTurma(int anoTurma) {
        this.anoTurma = anoTurma;
    }



    //Métodos Customizados


    @Override
    public String toString() {
        return "Turma{" +
                "serieTurma: '" + serieTurma + '\n' +
                ", anoTurma: '" + anoTurma + '\n' +
                '}';
    }
}
