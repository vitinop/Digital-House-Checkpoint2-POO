package entities.exception;

public class MensagemException extends Exception {

    //Construtor padrão
    public MensagemException() {
    }

    //Construtor com sobrecarga Super
    public MensagemException(String msg) {
        super(msg);
    }


    //Métodos customizados

    @Override
    public String toString() {
        return getMessage();
    }
}