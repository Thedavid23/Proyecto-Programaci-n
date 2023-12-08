package ProyectoIntroProgra;

public class Main {

    public static void main(String[] args) {
        // Agregar usuarios
        UsuarioManager.agregarUsuarios();

        // Mostrar información de los usuarios almacenados
        UsuarioManager.mostrarInformacionUsuarios();

        // Iniciar sesión
        Inicio_Sesion.IniciarSesion();
    }
    
}