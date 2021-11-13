package br.com.alura;

import java.util.*;

public class Curso {

    private String nome;
    private String nomeDoInstrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome, String nomeDoInstrutor) {
        this.nome = nome;
        this.nomeDoInstrutor = nomeDoInstrutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDoInstrutor() {
        return nomeDoInstrutor;
    }

    public void setNomeDoInstrutor(String nomeDoInstrutor) {
        this.nomeDoInstrutor = nomeDoInstrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(this.aulas);
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempoEmMinutos).sum();
    }

    @Override
    public String toString() {
        return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + ", aulas: " + this.aulas + "]";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(this.alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }
}
