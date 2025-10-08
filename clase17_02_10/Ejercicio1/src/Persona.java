import java.time.LocalDate;
import java.time.Period;

public class Persona {

    // ---- Atributos de la Clase Persona ----

    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    // ---- Constructor de la Clase Persona ----

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    // ---- Getters y Setters de la Clase Persona ----

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // ---- Metodos de la Clase Persona ----

    private int getCurrentAge() {
        if (fechaNacimiento == null) {
            return 0;
        }

        LocalDate today = LocalDate.now();
        return Period.between(fechaNacimiento, today).getYears();
    }

    private boolean hasBirthdayPassedThisYear() {
        if (fechaNacimiento == null) {
            return false;
        }

        LocalDate today = LocalDate.now();
        LocalDate birthdayThisYear = fechaNacimiento.withYear(today.getYear());

        return today.isAfter(birthdayThisYear);
    }

    private boolean isBirthdayToday() {
        if (fechaNacimiento == null) {
            return false;
        }

        LocalDate today = LocalDate.now();
        return today.getMonth() == fechaNacimiento.getMonth() &&
                today.getDayOfMonth() == fechaNacimiento.getDayOfMonth();
    }

    public String getFormattedPersonAge() {
        StringBuilder sb = new StringBuilder();

        sb.append("Nombre: ");
        sb.append(this.getNombre());
        sb.append(" ");
        sb.append(this.getApellido());
        sb.append("\nEdad: ");
        sb.append(this.getCurrentAge());

        if (this.isBirthdayToday()) {
            sb.append("\nFELIZ CUMPLE ")
                    .append(this.fechaNacimiento.getDayOfMonth())
                    .append("/")
                    .append(this.fechaNacimiento.getMonthValue());
        } else if (this.hasBirthdayPassedThisYear()) {
            sb.append("\nYa cumplió este año el dia: ")
                    .append(this.fechaNacimiento.getDayOfMonth())
                    .append("/")
                    .append(this.fechaNacimiento.getMonthValue());
        } else {
            sb.append("\nCumple este año el dia: ")
                    .append(this.fechaNacimiento.getDayOfMonth())
                    .append("/")
                    .append(this.fechaNacimiento.getMonthValue());
        }

        return sb.toString();
    }

    // ---- ToString de la Clase Persona ----

    @Override
    public String toString() {
        return getNombre() + "," + getApellido() + "," + getFechaNacimiento();
    }
}
