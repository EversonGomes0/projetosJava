package dados.projetosJava.B_BibliotecaDigital.test;

import dados.projetosJava.B_BibliotecaDigital.model.Aluno;
import dados.projetosJava.B_BibliotecaDigital.model.Livro;
import dados.projetosJava.B_BibliotecaDigital.model.Status;
import dados.projetosJava.B_BibliotecaDigital.model.Usuario;

public class MainBiblioteca {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João Silva", 1);
        Aluno aluno2 = new Aluno("Ana Clara", 2);
        Livro livro1 = new Livro("Habitos Atomicos","James clear", Status.EMPRESTADO);


    }
}
