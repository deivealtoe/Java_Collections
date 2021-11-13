package br.com.alura;

import java.util.Comparator;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 15));
        javaColecoes.adiciona(new Aula("Revistando as ArrayLists", 14));
        javaColecoes.adiciona(new Aula("Listas de objetos", 15));
        javaColecoes.adiciona(new Aula("Relacionamento de listas e objetos", 18));

        System.out.println(javaColecoes.getAulas());
    }
}
