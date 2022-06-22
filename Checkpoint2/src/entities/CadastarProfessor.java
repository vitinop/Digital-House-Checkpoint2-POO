package entities;

public abstract class CadastarProfessor {
    private String formacaoAcademica;
    private int matricula;
    private String nome;

    public CadastarProfessor(String formacaoAcademica, int matricula, String nome) {
        this.formacaoAcademica = formacaoAcademica;
        this.matricula = matricula;
        this.nome = nome;
    }

    public CadastarProfessor() {

    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
