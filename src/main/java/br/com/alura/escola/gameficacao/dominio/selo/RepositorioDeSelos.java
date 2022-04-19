package br.com.alura.escola.gameficacao.dominio.selo;

import br.com.alura.escola.shared.dominio.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void adicionarSelo(Selo selo);
    List<Selo> selosDoAlunoComCPF(CPF cpf);
}
