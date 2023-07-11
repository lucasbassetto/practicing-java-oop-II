package br.com.account.repository;

import br.com.account.ordenacao.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaEmMemoriaRepository implements Repository {

    private List<Pessoa> dados = new ArrayList<>();

    @Override
    public Pessoa salvar(Pessoa pessoa) {
        if(consultar(pessoa.getCpf()) == null){
            dados.add(pessoa);
            return pessoa;
        }
        throw new IllegalArgumentException("Já existe pessoa com esse CPF cadastrado");
    }

    @Override
    public void atualizar(Pessoa pessoa) {
       if(consultar(pessoa.getCpf()) == null) {
           throw new IllegalArgumentException("Não existe pessoa cadastrada com esse CPF");
       }
        deletar(pessoa);
        salvar(pessoa);
    }

    @Override
    public void deletar(Pessoa pessoa) {
        if(consultar(pessoa.getCpf()) == null) {
            throw new IllegalArgumentException("Não existe pessoa cadastrada com esse CPF");
        }
        dados.remove(pessoa);
    }

    @Override
    public Pessoa consultar(String cpf) {
        for(Pessoa pessoa : dados) {
            if(pessoa.getCpf().equalsIgnoreCase(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    @Override
    public List<Pessoa> listaTodos() {
        return dados;
    }
}
