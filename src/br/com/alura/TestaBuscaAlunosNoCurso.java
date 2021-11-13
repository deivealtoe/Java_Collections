package br.com.alura;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Revistando as ArrayLists", 20));
        javaColecoes.adiciona(new Aula("Listas de objetos", 24));

        Aluno a3 = new Aluno("Mauricio Anchie", 17645);
        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a4 = new Aluno("João Neiva", 6687);
        Aluno a5 = new Aluno("Guilherme Silveira", 5617);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Quem é o aluno com matrícula 5617?");
        javaColecoes.buscaMatriculado(5617);
    }
}
