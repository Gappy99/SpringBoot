package org.datacoins.kinvana.persistence.crud;

import org.datacoins.kinvana.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrud extends CrudRepository<Cliente, Integer> {
    //puede sustituir al DAO
    //esta interfaz tiene todos los metodos genericos del CRUD

}
