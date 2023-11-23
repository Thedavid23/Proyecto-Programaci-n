
package proyectomodulo1;
import javax.swing.JOptionPane;

public class Usuario {
    //Atributos del usuario
    private String nombre;
    private String apellidos;
    private String usuario;
    private String password;
    private boolean estado;
    private String correo;
    
    //Constructor con los atributos como parámetros
    public Usuario(String nombre, String apellidos, String usuario, String password, boolean estado, String correo){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.password = password;
        this.estado = estado;
        this.correo = correo;
    }
    
    // Métodos getters y setters para los atributos del usuario
    
    // Getters y setters para el atributo nombre
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    // Getters y setters para el atributo apellidos
    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    // Getters y setters para el atributo usuario
    public String getUsuario(){
        return usuario;
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    // Getters y setters para el atributo password
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    // Getters y setters para el atributo estado
    public boolean getEstado(){
        return estado;
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    
    // Getters y setters para el atributo correo
    public String getCorreo(){
        return correo;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    //Metodo para agregar los datos del usuario
    public static void Agregar() {
        // Solicitar datos del usuario
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
        String apellidos = JOptionPane.showInputDialog(null, "Ingrese sus apellidos:");
        String usuario = JOptionPane.showInputDialog(null, "Ingrese su nombre de usuario:");
        String password = JOptionPane.showInputDialog(null, "Ingrese su contraseña:");
        String correo = JOptionPane.showInputDialog(null, "Ingrese su correo electrónico:");
        boolean estado = true; 
        
        Usuario registroUsuarios = new Usuario(nombre, apellidos, usuario, password, estado, correo);
    }
}


