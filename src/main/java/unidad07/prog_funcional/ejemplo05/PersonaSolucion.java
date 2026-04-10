package unidad07.prog_funcional.ejemplo05;

import java.time.LocalDate;
import java.util.function.Function;

/**
 * <p>
 * Tenemos esta clase que a la hora de devolver datos de la dirección dispone de varios getters: getLocalidad,
 * getProvincia, getCodigoPostal y getDireccion.
 * </p>
 * <p>
 * El problema es que todos ellos repiten mucho código. ¿Cómo lo solucionarías...?
 * </p>
 */
public class PersonaSolucion {
    private String nombre;
    private String dni;
    private String email;
    private LocalDate fechaNacimiento;
    private boolean casada;
    private Direccion direccionPostal;

    class Direccion {
        String localidad;
        String provincia;
        String codigoPostal;
        String direccion;

        public Direccion(String localidad, String provincia, String codigoPostal, String direccion) {
            this.localidad = emptyNotNull(localidad);
            this.provincia = emptyNotNull(provincia);
            this.codigoPostal = emptyNotNull(codigoPostal);
            this.direccion = emptyNotNull(direccion);
        }

        private String emptyNotNull(String value) {
            return (value == null || value.isBlank() ? "" : value);
        }

        public String getLocalidad() {
            return localidad;
        }

        public String getProvincia() {
            return provincia;
        }

        public String getCodigoPostal() {
            return codigoPostal;
        }

        public String getDireccion() {
            return direccion;
        }

        @Override
        public String toString() {
            return direccion + " (" + codigoPostal + "), " + localidad + " [" + provincia + "]";
        }
    }

    public PersonaSolucion(String nombre,
                           String dni,
                           String email,
                           LocalDate fechaNacimiento,
                           boolean casada,
                           String localidad,
                           String provincia,
                           String cp,
                           String dir) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.casada = casada;
        this.direccionPostal = new Direccion(localidad, provincia, cp, dir);
    }

    public PersonaSolucion(String nombre, String dni, String email, LocalDate fechaNacimiento) {
        this(nombre, dni, email, fechaNacimiento, false, null, null, null, null);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public boolean isCasada() {
        return casada;
    }

    /**
     * Definimos un método al que recurrirán los getters.
     * @param extractor
     * @return
     */
    private String getCampoDireccion(Function<Direccion, String> extractor) {
        return (direccionPostal != null)
                ? extractor.apply(direccionPostal)
                : "";
    }

    public String getLocalidad() {
        return getCampoDireccion(direccion -> direccion.localidad);
    }

    public String getProvincia() {
        return getCampoDireccion(direccion -> direccion.provincia);
    }

    public String getCodigoPostal() {
        return getCampoDireccion(direccion -> direccion.codigoPostal);
    }

    public String getDireccion() {
        return getCampoDireccion(direccion -> direccion.direccion);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", casada=" + casada +
                ", direccionPostal=" + direccionPostal +
                '}';
    }
}
