
package proyectomodulo1;

import javax.swing.JOptionPane;

public class ProyectoModulo1 {

    public static void main(String[] args) {
        
        Usuario registroUsuarios [] = new Usuario [10];
        
        boolean continuar = true;
        
        while (continuar){
            String opcion = JOptionPane.showInputDialog(null,"1. Módulo 1 \n2. Módulo 2 \n3. Módulo 3 \n4. Salir");
            int opcionElegida = Integer.parseInt(opcion);
        
            switch (opcionElegida){
                
                case 1:
                    boolean continuarM1 = true;
                    while(continuarM1){
                        String opcionM1 = JOptionPane.showInputDialog(null,"1. Iniciar sesión 1 \n2. Registrarse 2 \n3. volver");
                        int opcionElegidaM1 = Integer.parseInt(opcionM1);
                        
                        switch (opcionElegidaM1){
                        
                            case 1:
                                //En proceso...
                                break;
                                
                            case 2:
                                Usuario.Agregar();
                                break;
                                
                            case 3:
                                continuarM1 = false; 
                                break;
                                
                            default:
                                JOptionPane.showMessageDialog(null, "Opción elegida no es inválida. Eliga una de las opciones mostradas en pantalla");
                                break;
                        }
                    }
                    
                case 2:
                    //En proceso...
                    break;
                    
                case 3:
                    //En proceso...
                    break;
                    
                case 4:
                    continuar = false;
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opción elegida no es inválida. Eliga una de las opciones mostradas en pantalla");
                    break;
            }
        }
    }
    
}
