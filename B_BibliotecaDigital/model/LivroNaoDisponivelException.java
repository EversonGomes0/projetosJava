package dados.projetosJava.B_BibliotecaDigital.model;

public class LivroNaoDisponivelException extends Exception {
    public LivroNaoDisponivelException(String message) {
        super(message);
    }
}
