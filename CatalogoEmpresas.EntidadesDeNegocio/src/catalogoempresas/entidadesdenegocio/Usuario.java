package catalogoempresas.entidadesdenegocio;

import java.time.LocalDate;

public class Usuario {
    private int id;
    private int idRol;
    private String nombre;
    private String apellido;
    private String login;
    private String password;
    private byte estatus;
    private LocalDate fechaRegistro;
    private int top_aux;
    private String confirmPassword_aux;
    private Rol rol;
}
