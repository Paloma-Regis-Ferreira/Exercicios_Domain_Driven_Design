package br.com.alura.escola.gameficacao.infra.selos;

import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.gameficacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.gameficacao.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    private List<Selo> selos = new ArrayList<>();

    @Override
    public void adicionarSelo(Selo selo) {

    }

    @Override
    public List<Selo> selosDoAlunoComCPF(CPF cpf) {
        return null;
    }
}
