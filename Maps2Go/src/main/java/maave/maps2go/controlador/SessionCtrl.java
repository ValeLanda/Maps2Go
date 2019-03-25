package maave.maps2go.controlador;

import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;

@ManagedBean
@SessionScoped
public class SessionCtrl implements Serializable{
    private String correo;

    public String getCorreo() {
        // Automatically generated method. Please do not modify this code.
        return this.correo;
    }

    public void setCorreo(String value) {
        // Automatically generated method. Please do not modify this code.
        this.correo = value;
    }

    private String contrasenia;

    public String getContrasenia() {
        // Automatically generated method. Please do not modify this code.
        return this.contrasenia;
    }

    public void setContrasenia(String value) {
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
