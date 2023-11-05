package com.Hotelera.persistance.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "HABITACIONES")
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_habitacion")
    private Integer idHabitacion;

    @Column(name = "numero_habitacion")
    private int numeroHabitacion;


    private char tamanio;

    private boolean cocineta;

    @Column(name = "estado_ocupado")
    private boolean estadoOcupado;
}
