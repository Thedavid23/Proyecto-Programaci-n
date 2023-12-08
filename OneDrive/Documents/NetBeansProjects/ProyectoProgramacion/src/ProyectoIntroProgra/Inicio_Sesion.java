package ProyectoIntroProgra;

import javax.swing.JOptionPane;


public class Inicio_Sesion {
    // Usuario y contraseña predeterminados
    private static final String usuarioCorrecto = "usuario";
    private static final String passwordCorrecto = "contraseña";

    
    //Metodo para realizar el inicio de sesión
    public static void IniciarSesion() {
        String usuarioIngresado = JOptionPane.showInputDialog(null, "Ingrese su nombre de usuario:");
        String passwordIngresado = JOptionPane.showInputDialog(null, "Ingrese su contraseña:");

        if (usuarioIngresado.equals(usuarioCorrecto) && passwordIngresado.equals(passwordCorrecto)) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso. ¡Bienvenido!");
        } else {
            JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos. Inténtelo nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
    
