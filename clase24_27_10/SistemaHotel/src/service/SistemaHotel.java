package service;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

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

    // ---- Métodos ----

    /**
     * Realiza una reserva de habitación si hay disponibilidad.
     *
     * @param reserva El objeto Reserva que contiene los datos de la reserva.
     * @throws IllegalStateException Si no hay habitaciones disponibles o la
     *                               habitación ya está ocupada.
     */
    public void agregarReserva(Reserva reserva) {

        if (habitacionesOcupadas.size() >= TOTAL_HABITACIONES) {
            throw new IllegalStateException("No hay habitaciones disponibles.");
        }

        if (habitacionesOcupadas.containsKey(reserva.getNumeroHabitacion())) {
            throw new IllegalStateException("La habitación " + reserva.getNumeroHabitacion() + " ya está ocupada.");
        }

        reservas.put(reserva.getCodigoReserva(), reserva);
        habitacionesOcupadas.put(reserva.getNumeroHabitacion(), reserva.getCodigoReserva());
    }

    /**
     * Confirma una reserva existente cambiando su estado a CONFIRMADA.
     *
     * @param codigoReserva Código único que identifica la reserva a confirmar.
     * @throws ReservaNoEncontradaException Si no existe una reserva con el código
     *                                      proporcionado.
     */
    public void confirmarReserva(String codigoReserva) throws ReservaNoEncontradaException {
        Reserva reserva = buscarReservaPorCodigo(codigoReserva);
        reserva.setEstado(EstadoReserva.CONFIRMADA);
    }

    /**
     * Realiza el check-in de una reserva existente, cambiando su estado a CHECK_IN.
     *
     * @param codigoReserva Código único que identifica la reserva a registrar.
     * @throws ReservaNoEncontradaException Si no se encuentra una reserva con el
     *                                      código proporcionado.
     */
    public void hacerCheckIn(String codigoReserva) throws ReservaNoEncontradaException {
        Reserva reserva = buscarReservaPorCodigo(codigoReserva);
        reserva.setEstado(EstadoReserva.CHECK_IN);
    }

    /**
     * Realiza el check-out de una reserva existente, actualizando su estado y
     * liberando la habitación ocupada.
     *
     * @param codigoReserva Código único que identifica la reserva a finalizar.
     * @throws ReservaNoEncontradaException Si no se encuentra una reserva con el
     *                                      código proporcionado.
     */
    public void hacerCheckOut(String codigoReserva) throws ReservaNoEncontradaException {
        Reserva reserva = buscarReservaPorCodigo(codigoReserva);
        reserva.setEstado(EstadoReserva.CHECK_OUT);
        habitacionesOcupadas.remove(reserva.getNumeroHabitacion());
    }

    /**
     * Cancela una reserva existente, actualizando su estado a CANCELADA y liberando
     * la habitación ocupada.
     *
     * @param codigoReserva Código único que identifica la reserva a cancelar.
     * @throws ReservaNoEncontradaException Si no se encuentra una reserva con el
     *                                      código proporcionado.
     */
    public void cancelarReserva(String codigoReserva) throws ReservaNoEncontradaException {
        Reserva reserva = buscarReservaPorCodigo(codigoReserva);
        reserva.setEstado(EstadoReserva.CANCELADA);
        habitacionesOcupadas.remove(reserva.getNumeroHabitacion());
    }

    /**
     * Busca y devuelve una reserva existente según su código único.
     *
     * @param codigoReserva Código único que identifica la reserva a buscar.
     * @return La reserva correspondiente al código proporcionado.
     * @throws ReservaNoEncontradaException Si no se encuentra una reserva con el
     *                                      código dado.
     */
    public Reserva buscarReservaPorCodigo(String codigoReserva) throws ReservaNoEncontradaException {

        Reserva reserva = reservas.get(codigoReserva);

        if (reserva == null) {
            throw new ReservaNoEncontradaException("Reserva con código " + codigoReserva + " no encontrada.");
        }

        return reserva;
    }

    /**
     * Obtiene una lista de reservas que coinciden con el estado especificado.
     *
     * @param estado Estado de reserva a filtrar (CONFIRMADA, CHECK_IN, CHECK_OUT,
     *               CANCELADA, etc.).
     * @return Lista de reservas que tienen el estado indicado.
     */
    public List<Reserva> obtenerReservasPorEstado(EstadoReserva estado) {
        List<Reserva> reservasPorEstado = new ArrayList<>();
        for (Reserva reserva : reservas.values()) {
            if (reserva.getEstado() == estado) {
                reservasPorEstado.add(reserva);
            }
        }
        return reservasPorEstado;
    }

    /**
     * Genera un reporte textual con estadísticas de ocupación del hotel.
     *
     * Incluye el total de reservas, cantidad de habitaciones ocupadas y el
     * porcentaje de ocupación.
     *
     * @return Cadena de texto con el reporte de ocupación actual.
     */
    public String generarReporteOcupacion() {
        int ocupadas = habitacionesOcupadas.size();
        int total = TOTAL_HABITACIONES;
        double porcentajeOcupacion = (ocupadas * 100.0) / total;

        StringBuilder reporte = new StringBuilder();
        reporte.append("Total reservas: ").append(reservas.size()).append("\n");
        reporte.append("Habitaciones ocupadas: ").append(ocupadas).append("\n");
        reporte.append("Ocupación: ").append(String.format("%.2f", porcentajeOcupacion)).append("%\n");

        return reporte.toString();
    }
}