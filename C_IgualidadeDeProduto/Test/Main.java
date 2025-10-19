package dados.projetosJava.C_IgualidadeDeProduto.Test;

import dados.projetosJava.C_IgualidadeDeProduto.Dominio.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1L,"Maçã");
        Produto produto2 = new Produto(6L,"Laranja");

        if (!produto2.equals(produto1)){
            System.out.println("Os id dos produtos não são iguais");
        }else{
            System.out.println("Os id dos produtos são iguais");
        }
    }
}
