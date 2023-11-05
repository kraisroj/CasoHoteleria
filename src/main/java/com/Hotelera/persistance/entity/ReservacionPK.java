package com.Hotelera.persistance.entity;

import jakarta.persistence.Column;

import java.io.Serializable;

public class ReservacionPK implements Serializable {
    @Column(name = "id_habitacion")
    private Integer idHabitacion;

    @Column(name = "id_huesped")
    private Integer idHuesped;

    public Integer getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Integer getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(Integer idHuesped) {
        this.idHuesped = idHuesped;
    }
}
