package br.com.alura.escola.academico.gameficacao.dominio.selo;

import br.com.alura.escola.academico.academico.dominio.aluno.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void adicionarSelo(Selo selo);
    List<Selo> selosDoAlunoComCPF(CPF cpf);
}
