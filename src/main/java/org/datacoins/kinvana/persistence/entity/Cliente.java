package org.datacoins.kinvana.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Clientes")
//Loombok
@Data //genera setter y getters
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode //codigo de autenticacion de la entidad
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoCliente;
    @Column
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String genero;
    private Integer edad;
}