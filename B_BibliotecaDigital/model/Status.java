package dados.projetosJava.B_BibliotecaDigital.model;

public enum Status {
    DISPONIVEL("Disponível!"), EMPRESTADO("Emprestado!");

    private String descricao;
    Status(String descricao){
        this.descricao = descricao;
    }
}
