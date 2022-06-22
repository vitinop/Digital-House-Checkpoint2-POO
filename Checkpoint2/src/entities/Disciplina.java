package entities;

public class Disciplina {
    public double notaAluno;
    public String nomeDisciplina;

    public Disciplina(double notaAluno, String nomeDisciplina) {
        this.notaAluno = notaAluno;
        this.nomeDisciplina = nomeDisciplina;
    }

    public double getNotaAluno() {
        return notaAluno;
    }

    public void setNotaAluno(double notaAluno) {
        this.notaAluno = notaAluno;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
}
