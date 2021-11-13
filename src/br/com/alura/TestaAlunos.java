package br.com.alura;

import java.util.*;

public class TestaAlunos {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();

        alunos.add("Rodrigo Turini");
        alunos.add("Nico Steppat");

        System.out.println(alunos);

        alunos.add("Alberto Souza");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        alunos.forEach(System.out::println);

        System.out.println();
        alunos.remove("Sergio Lopes");

        alunos.forEach(System.out::println);

        List<String> alunosList = new ArrayList<>(alunos);
    }
}
