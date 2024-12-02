package org.example.biblioteca.sistema;

import java.time.LocalDate;

public class Livro {

    private int idLivro, idAutor, idGenero;
    private LocalDate ano;
    private int estoque;

    public Livro(int idLivro, int idAutor, int idGenero, LocalDate ano, int estoque) {
        this.idLivro = idLivro;
        this.idAutor = idAutor;
        this.idGenero = idGenero;
        this.ano = ano;
        this.estoque = estoque;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
