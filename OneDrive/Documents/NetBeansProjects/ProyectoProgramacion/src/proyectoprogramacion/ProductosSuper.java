package proyectoprogramacion;

import javax.swing.JOptionPane;

public class ProductosSuper {
   public int Id;
   public String Nombre_Producto;
   public String Categoria;
   public double Precio;
   public int Existencias;
   public String Fecha_Caducidad;
   
    // Contador de productos por pasillos
   
   private static int Max_Productos_Por_Pasillos = 10;

   private static ProductosSuper[][] pasillos = new ProductosSuper[10][Max_Productos_Por_Pasillos];
  
   
       // Contador para asignar IDs
    private static int contadorID = 1;

    public ProductosSuper() {
        // Asignar un ID al producto
        this.Id = contadorID++;
    }

    public static void main(String[] args) {
        if (contadorID > 100) {
            System.out.println("Se ha alcanzado el límite de creación de productos (100 productos).");
            return;
        }
   
       // Solicitar al usuario los datos del producto
        String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        String categoria = JOptionPane.showInputDialog("Seleccione la categoría del producto: (Frescos, Granos, Carnicería, Abarrotes, Cereales, Limpieza, Lácteos, Panadería, Hogar, Congelados)");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
        int existencias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de existencias del producto:"));
        String fechaCaducidad = JOptionPane.showInputDialog("Ingrese la fecha de caducidad del producto (en formato dd/mm/aaaa):");
       

        // Crear un objeto de la clase ProductosSuper
        ProductosSuper producto = new ProductosSuper();
        producto.Nombre_Producto = nombreProducto;
        producto.Categoria = categoria;
        producto.Precio = precio;
        producto.Existencias = existencias;
        producto.Fecha_Caducidad = fechaCaducidad;

        // Imprimir los datos del producto
        System.out.println("Producto registrado con éxito.");
        System.out.println("ID: " + producto.Id);
        System.out.println("Nombre del producto: " + producto.Nombre_Producto);
        System.out.println("Categoría: " + producto.Categoria);
        System.out.println("Precio: " + producto.Precio);
        System.out.println("Existencias: " + producto.Existencias);
        System.out.println("Fecha de caducidad: " + producto.Fecha_Caducidad);
    }
    
    // Función para organizar el producto por pasillos
    private static void organizarProductoEnPasillo(ProductosSuper producto) {
        for (int pasillo = 0; pasillo < pasillos.length; pasillo++) {
            if (producto.Categoria.equalsIgnoreCase(pasilloCategoria(pasillo))) {
                int posicion = Integer.parseInt(JOptionPane.showInputDialog("En qué posición del pasillo (0-9) desea colocar el producto:"));
                if (posicion >= 0 && posicion < Max_Productos_Por_Pasillos) {
                    if (pasillos[pasillo][posicion] == null) {
                        pasillos[pasillo][posicion] = producto;
                        return;
                    } else {
                        System.out.println("La posición del pasillo ya está ocupada por otro producto.");
                        return;
                    }
                } else {
                    System.out.println("Posición no válida. Debe estar en el rango de 0 a 9.");
                    return;
                }
            }
        }
        System.out.println("No se encontró un pasillo correspondiente para la categoría del producto.");
    }
    
      // Función para la categoría correspondiente de un pasillo
    private static String pasilloCategoria(int pasillo) {
        switch (pasillo) {
            case 0: return "Frescos";
            case 1: return "Granos";
            case 2: return "Carnicería";
            case 3: return "Abarrotes";
            case 4: return "Cereales";
            case 5: return "Limpieza";
            case 6: return "Lácteos";
            case 7: return "Panadería";
            case 8: return "Hogar";
            case 9: return "Congelados";
            default: return "";
        }
    }
}
