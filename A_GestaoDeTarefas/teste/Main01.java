package dados.projetosJava.A_GestaoDeTarefas.teste;

import dados.projetosJava.A_GestaoDeTarefas.model.Prioridade;
import dados.projetosJava.A_GestaoDeTarefas.model.Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        while (true) {
            System.out.println("\n== MENU ==");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefa");
            System.out.println("3. Marcar como concluida");
            System.out.println("4. Sair ");
            System.out.println("> ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Titulo: ");
                    String titulo = scanner.nextLine();

                    System.out.println("Descrição: ");
                    String descricao = scanner.nextLine();

                    System.out.println("Prioridade: (BAIXA, MEDIA, ALTA)");
                    Prioridade prioridade = Prioridade.valueOf(scanner.nextLine().toUpperCase());

                    tarefas.add(new Tarefa(titulo,descricao,prioridade));
                    System.out.println("Tarefa adicionada!");
                    break;
                case 2:
                    if (tarefas.isEmpty()){
                        System.out.println("Ainda não há tarefas");
                    }
                    for(int i = 0; i < tarefas.size(); i++ ){
                        System.out.println((i + 1) + " | "+tarefas.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Qual o numero da tarefa a marcar como concluida?");
                    int index = scanner.nextInt() - 1;
                    if (index >= 0 && index < tarefas.size()){
                        tarefas.get(index).marcarComoConcluida();
                        System.out.println("Tarefa concluida com sucesso!");
                    } else{
                        System.out.println("Numero invalido");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
            }
        }
    }
}
