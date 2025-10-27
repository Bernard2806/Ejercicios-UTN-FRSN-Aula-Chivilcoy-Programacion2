package models;

import java.time.LocalDate;

import enums.EstadoReserva;

public class Reserva {

    // ---- Atributos ----
    private String codigoReserva;
    private String nombreHuesped;
    private int numeroHabitacion;
    private int cantidadNoches;
    private EstadoReserva estado;
    private LocalDate fechaIngreso;

    // ---- Constructor ----
    public Reserva(String codigoReserva, String nombreHuesped, int numeroHabitacion, int cantidadNoches) {
        this.codigoReserva = codigoReserva;
        this.nombreHuesped = nombreHuesped;
        this.numeroHabitacion = numeroHabitacion;
        this.cantidadNoches = cantidadNoches;
        this.estado = EstadoReserva.PENDIENTE;
        this.fechaIngreso = LocalDate.now();
    }

    // ---- Getters ----
    public String getCodigoReserva() {
        return codigoReserva;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public int getCantidadNoches() {
        return cantidadNoches;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    // ---- Setters ----
    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    // ---- toString ----
    @Override
    public String toString() {
        return "Código: [" + codigoReserva + "] | Huésped: [" + nombreHuesped + "] | Habitación: ["
                + numeroHabitacion + "] | Noches: [" + cantidadNoches + "] | Estado: [" + estado + "]";
    }
}
