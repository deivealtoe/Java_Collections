package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        List<String> aulas = new ArrayList<>();

        aulas.add(aula2);
        aulas.add(aula1);
        aulas.add(aula3);

        System.out.println(aulas.toString());

        aulas.remove(0);

        System.out.println(aulas);

        aulas.forEach(aula -> {
            System.out.println("Aula " + (aulas.indexOf(aula) + 1) + ": " + aula);
        });

        System.out.println("A primeira aula é: " + aulas.get(0));

        for (int i = 0; i < aulas.size(); ++i) {
            System.out.println("Aula " + (i + 1) + ": " + aulas.get(i));
        }

        aulas.clear();

        aulas.add(aula2);
        aulas.add(aula1);
        aulas.add(aula3);

        System.out.println("Desordenado: " + aulas);
        Collections.sort(aulas);
        System.out.println("Ordenado: " + aulas);
    }
}
