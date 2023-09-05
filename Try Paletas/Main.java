public class Main {
    public static void main(String[] args) {
        //creation of the palette type array
        Paleta[] paletas = new Paleta[4];
        // instances of PaletteWater and PaletteCremosa are created by passing values ​​to each xampo
        PaletaAgua paletaAgua=new PaletaAgua("Limon", 67, true);
        PaletaAgua paletaAgua1=new PaletaAgua("Guayaba", 20, true);
        PaletaCrema paletaCrema=new PaletaCrema("Oreo", 30, true);
        PaletaCrema paletaCrema1=new PaletaCrema("Fresa", 10.0, true);
        // the operations we want are performed for each one
        System.out.println("********************");
        try {
            paletaAgua.mostrarInformacion();
            paletaAgua.mostrarBaseAgua();
            paletaAgua.cambiarPrecio(0.0);
            paletaAgua.agregarComplemento("chamoy");
            paletaAgua.mostrarInformacion();
            System.out.println("********************");
            paletaAgua1.mostrarInformacion();
            paletaAgua1.mostrarBaseAgua();
            paletaAgua1.cambiarPrecio(0.0);
            paletaAgua1.agregarComplemento("Miguelito");
            paletaAgua1.mostrarInformacion(); 
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("********************");
    }
}
