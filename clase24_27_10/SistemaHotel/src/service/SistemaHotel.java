package service;

import java.util.HashMap;

import enums.EstadoReserva;
import exceptions.ReservaNoEncontradaException;
import models.Reserva;

public class SistemaHotel {

    // ---- Atributos ----
    private HashMap<String, Reserva> reservas;
    private HashMap<Integer, String> habitacionesOcupadas;

    // ---- Constante ----
    private static final int TOTAL_HABITACIONES = 50;

    // ---- Constructor ----
    public SistemaHotel() {
        this.reservas = new HashMap<>();
        this.habitacionesOcupadas = new HashMap<>();
    }
}
