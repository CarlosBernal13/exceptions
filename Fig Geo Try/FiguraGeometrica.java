public class FiguraGeometrica {
    //class attribute
    protected String nombre;
    //create the constructor
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
    // create the get and set of name
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Method calculateArea()
    public double calcularArea() {
        return 0.0;
    }
    // method calculate perimeter
    public double calcularPerimetro() {
        return 0.0;
    }
}


