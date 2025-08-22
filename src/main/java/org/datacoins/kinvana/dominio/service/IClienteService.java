package org.datacoins.kinvana.dominio.service;

import org.datacoins.kinvana.persistence.entity.Cliente;

import java.util.List;


public interface IClienteService {
    //firmas de metodo
    List<Cliente> listarClientes();
    Cliente buscarClientePorId(Integer codigo);
    void guardarCliente(Cliente cliente);
    void eliminarCliente(Cliente cliente);

}
