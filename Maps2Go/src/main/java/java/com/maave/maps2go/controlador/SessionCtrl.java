package java.com.maave.maps2go.controlador;

import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;

@ManagedBean
@SessionScoped
public class SessionCtrl implements Serializable{
    private String correo;

    private String getCorreo() {
        // Automatically generated method. Please do not modify this code.
        return this.correo;
    }

    private void setCorreo(String value) {
        // Automatically generated method. Please do not modify this code.
        this.correo = value;
    }

    private String contrasenia;

    private String getContrasenia() {
        // Automatically generated method. Please do not modify this code.
        return this.contrasenia;
    }

    private void setContrasenia(String value) {
        // Automatically generated method. Please do not modify this code.
        this.contrasenia = value;
    }

    public String iniciarSesion() {
        return "";
    }

    public String cerrarSesion() {
        return "";
    }

}
