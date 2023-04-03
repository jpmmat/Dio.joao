package Dio.ultimo.projeto.Dio.joao.service;

import Dio.ultimo.projeto.Dio.joao.model.cliente;

public interface ClienteService  {
    
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void insrir(Cliente clietne);

    void atualizar(long id, Cliente cliente);

    void deletar( Long id);
    
}
