package br.com.alura;

public class Aula extends Object implements Comparable<Aula> {

    private String titulo;
    private int tempoEmMinutos;

    public Aula(String titulo, int tempoEmMinutos) {
        this.titulo = titulo;
        this.tempoEmMinutos = tempoEmMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTempoEmMinutos() {
        return tempoEmMinutos;
    }

    public void setTempoEmMinutos(int tempoEmMinutos) {
        this.tempoEmMinutos = tempoEmMinutos;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "titulo='" + titulo + '\'' +
                ", tempoEmMinutos=" + tempoEmMinutos +
                '}';
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.getTitulo());
    }
}
