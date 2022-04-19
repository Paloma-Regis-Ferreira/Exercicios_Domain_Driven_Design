package br.com.alura.escola.gameficacao.dominio.selo;

import br.com.alura.escola.shared.dominio.CPF;

public class Selo {

    private String nomeSelo;
    private CPF cpfAluno;

    public Selo(String nomeSelo, CPF cpfAluno) {
        this.nomeSelo = nomeSelo;
        this.cpfAluno = cpfAluno;
    }

    public String getNomeSelo() {
        return nomeSelo;
    }

    public CPF getCpfAluno() {
        return cpfAluno;
    }
}
