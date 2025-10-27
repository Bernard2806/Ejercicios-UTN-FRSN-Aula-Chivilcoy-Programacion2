package enums;

public enum EstadoReserva {
    PENDIENTE, // Reserva que ha sido creada pero no confirmada
    CONFIRMADA, // Reserva que ha sido confirmada
    CHECK_IN, // Huesped ingresa al alojamiento
    CHECK_OUT, // Huesped sale del alojamiento
    CANCELADA  // Reserva que ha sido cancelada
}
