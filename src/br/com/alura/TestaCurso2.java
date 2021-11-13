package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 15));
        javaColecoes.adiciona(new Aula("Revistando as ArrayLists", 14));
        javaColecoes.adiciona(new Aula("Listas de objetos", 15));
        javaColecoes.adiciona(new Aula("Relacionamento de listas e objetos", 18));

        System.out.println(javaColecoes.getAulas());

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        System.out.println(aulas);
        //aulas.sort(Comparator.comparing(Aula::getTitulo));
        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);
    }
}
