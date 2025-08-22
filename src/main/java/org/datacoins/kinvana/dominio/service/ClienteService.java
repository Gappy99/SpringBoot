package org.datacoins.kinvana.dominio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.datacoins.kinvana.persistence.crud.ClienteCrud;
import org.datacoins.kinvana.persistence.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService{

    //Ingeyeccion de dependencia de mi repositorio (ClienteCrud) (ClienteRepositori)
    @Autowired
    private ClienteCrud crud;



    @Override
    public List<Cliente> listarClientes() {
        Iterable<Cliente> clientes = crud.findAll();
        return (List<Cliente>) clientes;
    }

    @Override
    public Cliente buscarClientePorId(Integer codigo) {
        Cliente cliente = crud.findById(codigo).orElse(null );
        return cliente;
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        crud.save(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        crud.delete(cliente);
    }
}
