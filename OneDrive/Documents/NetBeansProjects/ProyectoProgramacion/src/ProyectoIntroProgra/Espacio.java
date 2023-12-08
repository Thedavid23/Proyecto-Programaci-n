package ProyectoIntroProgra;

public class Espacio {
    
    public class EspacioParqueo {
    private int id;  // Identificador único del espacio
    private boolean discapacitado;
    private boolean cargaElectrica;
    private boolean techado;
    private boolean descubierto;
    private boolean activo;
    
    // Constructor
    public EspacioParqueo(int id, boolean discapacitado, boolean cargaElectrica, boolean techado, boolean descubierto) {
        this.id = id;
        this.discapacitado = discapacitado;
        this.cargaElectrica = cargaElectrica;
        this.techado = techado;
        this.descubierto = descubierto;
        this.activo = true;
    
}
        // Getters y setters para el atributo 'id'
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getters y setters para el atributo 'discapacitado'
    public boolean getDiscapacitado() {
        return discapacitado;
    }

    public void setDiscapacitado(boolean discapacitado) {
        this.discapacitado = discapacitado;
    }

    // Getters y setters para el atributo 'cargaElectrica'
    public boolean getCargaElectrica() {
        return cargaElectrica;
    }

    public void setCargaElectrica(boolean cargaElectrica) {
        this.cargaElectrica = cargaElectrica;
    }

    // Getters y setters para el atributo 'techado'
    public boolean getTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    // Getters y setters para el atributo 'descubierto'
    public boolean getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(boolean descubierto) {
        this.descubierto = descubierto;
    }

    // Getters y setters para el atributo 'activo'
    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    // Método para editar la información de un espacio
    public void editarEspacio(boolean discapacitado, boolean cargaElectrica, boolean techado, boolean descubierto) {
        this.discapacitado = discapacitado;
        this.cargaElectrica = cargaElectrica;
        this.techado = techado;
        this.descubierto = descubierto;
    }
    
    
    public class Parqueo {
    private static final int MAX_ESPACIOS = 100;  // Número máximo de espacios
    private EspacioParqueo[] espacios;
    private int cantidadEspacios;  // Número actual de espacios
    
    // Constructor
    public Parqueo() {
        espacios = new EspacioParqueo[MAX_ESPACIOS];
        cantidadEspacios = 0;
    }
    
    // Método privado para verificar si todos los espacios están libres
    private boolean espaciosLibres() {
        for (EspacioParqueo espacio : espacios) {
            if (espacio != null) {
                return false; // Hay al menos un espacio ocupado
            }
        }
        return true; // Todos los espacios están libres
    }
    
    
    // Método privado para desplazar los espacios y hacer espacio para uno nuevo
    private void desplazarEspacios() {
        for (int i = cantidadEspacios; i > 0; i--) {
            espacios[i] = espacios[i - 1];
        }
        cantidadEspacios++;
    }

    
    // Método para agregar un nuevo espacio de parqueo
    public void agregarEspacio(int id, boolean discapacitado, boolean cargaElectrica, boolean techado, boolean descubierto) {
        if (espaciosLibres()) {
            // Resto del código para agregar un espacio (como se hizo anteriormente)
            if (cantidadEspacios < MAX_ESPACIOS) {
                // Si es un espacio discapacitado, insertarlo al principio
                if (discapacitado) {
                    desplazarEspacios();
                    espacios[0] = new EspacioParqueo(id, discapacitado, cargaElectrica, techado, descubierto);
                } else {
                    espacios[cantidadEspacios++] = new EspacioParqueo(id, discapacitado, cargaElectrica, techado, descubierto);
                }
            } else {
                System.out.println("Error: Se alcanzó el límite de espacios en el parqueo.");
            }
        } else {
            System.out.println("Error: Todos los espacios deben estar libres para agregar un nuevo espacio.");
        }
    }
    
    // Método para editar la información de un espacio
    public void editarEspacio(int id, boolean discapacitado, boolean cargaElectrica, boolean techado, boolean descubierto) {
        if (espaciosLibres()) {
            
            for (int i = 0; i < cantidadEspacios; i++) {
                if (espacios[i].getId() == id) {
                    espacios[i].editarEspacio(discapacitado, cargaElectrica, techado, descubierto);

                    // Si se convierte en espacio discapacitado, ajustar la numeración
                    if (discapacitado && i > 0) {
                        intercambiarEspacios(i, 0);
                    }

                    break;
                }
            }
        } else {
            System.out.println("Error: Todos los espacios deben estar libres para editar un espacio.");
        }
    }
    
    // Método para inactivar un espacio
    public void inactivarEspacio(int id) {
        if (espaciosLibres()) {
            // Resto del código para inactivar un espacio (como se hizo anteriormente)
            for (int i = 0; i < cantidadEspacios; i++) {
                if (espacios[i].getId() == id) {
                    espacios[i].setActivo(false);
                    break;
                }
            }
        } else {
            System.out.println("Error: Todos los espacios deben estar libres para inactivar un espacio.");
        }
    }
    
    // Método privado para intercambiar la posición de dos espacios
    private void intercambiarEspacios(int indice1, int indice2) {
        EspacioParqueo temp = espacios[indice1];
        espacios[indice1] = espacios[indice2];
        espacios[indice2] = temp;
    }

}
}
}