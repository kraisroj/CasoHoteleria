package com.Hotelera.persistance.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

public class Reservacion {

    @EmbeddedId
    private ReservacionPK id;

    @Column(name = "id_reservacion")
    private Integer idReservacion;

    @Column(name = "fecha_reservacion")
    private Timestamp fechaReservacion;

    @Column(name = "dias_reservacion")
    private int diasReservacion;

    @Column(name = "metodo_pago")
    private char metodoPago;

    @OneToMany
    @JoinColumn(name = "id_huesped", insertable = false, updatable = false)
    private Huesped huesped;

    @OneToOne
    @JoinColumn(name = "id_habitacion", insertable = false, updatable = false)
    private Habitacion habitacion;

    public ReservacionPK getId() {
        return id;
    }

    public void setId(ReservacionPK id) {
        this.id = id;
    }

    public Integer getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(Integer idReservacion) {
        this.idReservacion = idReservacion;
    }

    public Timestamp getFechaReservacion() {
        return fechaReservacion;
    }

    public void setFechaReservacion(Timestamp fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    public int getDiasReservacion() {
        return diasReservacion;
    }

    public void setDiasReservacion(int diasReservacion) {
        this.diasReservacion = diasReservacion;
    }

    public char getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(char metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}
