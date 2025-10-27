import enums.EstadoReserva;
import models.Reserva;
import service.SistemaHotel;

public class App {
    public static void main(String[] args) throws Exception {
        Reserva reserva1 = new Reserva("R001", "Juan Peréz", 101, 3);
        Reserva reserva2 = new Reserva("R002", "María Gómez", 102, 2);

        SistemaHotel sistemaHotel = new SistemaHotel();

        System.out.println("=== SISTEMA DE RESERVAS HOTEL ===\n");
        System.out.println("Agregando reservas...");

        try {
            sistemaHotel.agregarReserva(reserva1);
            sistemaHotel.agregarReserva(reserva2);
            sistemaHotel.agregarReserva(reserva1); // Intento de agregar una reserva duplicada
        } catch (Exception e) {
            System.out.println("✗ Error: " + e.getMessage());
        }

        System.out.println("\nConfirmando reserva R001...");
        sistemaHotel.confirmarReserva("R001");
        System.out.println("✓ Reserva R001 confirmada");

        System.out.println("\nHaciendo check-in de R001...");
        sistemaHotel.hacerCheckIn("R001");
        System.out.println("✓ Check-in realizado para R001");

        System.out.println("\nBuscando reserva R001:");

        try {
            Reserva reservaBuscada = sistemaHotel.buscarReservaPorCodigo("R001");
            System.out.println(reservaBuscada);
        } catch (Exception e) {
            System.out.println("✗ Error: " + e.getMessage());
        }

        System.out.println("\nHaciendo check-out de R001...");
        sistemaHotel.hacerCheckOut("R001");
        System.out.println("✓ Check-out realizado (Habitación " + sistemaHotel.buscarReservaPorCodigo("R001").getNumeroHabitacion() + " liberada)");

        System.out.println("\nCancelando reserva R002...");
        sistemaHotel.cancelarReserva("R002");
        System.out.println("✓ Reserva R002 cancelada (Habitación " + sistemaHotel.buscarReservaPorCodigo("R002").getNumeroHabitacion() + " liberada)");

        System.out.println("\n=== REPORTE FINAL ===");
        System.out.println(sistemaHotel.generarReporteOcupacion());

        System.out.println("\nReservas en estado CHECK_OUT: ");
        sistemaHotel.obtenerReservasPorEstado(EstadoReserva.CHECK_OUT).forEach(System.out::println);
    }
}
