package br.com.account.repository;

import br.com.account.ordenacao.Pessoa;

import java.util.List;

public interface Repository {

    Pessoa salvar(Pessoa pessoa);

    void atualizar(Pessoa pessoa);

    void deletar(Pessoa pessoa);

    Pessoa consultar(String cpf);

    List<Pessoa> listaTodos();
}
