package org.example;

public class Pessoa {
    String nome;
    int idade;
    boolean maiorIdade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean MaiorIdade() {
        return getIdade() >= 18;
    }
}
