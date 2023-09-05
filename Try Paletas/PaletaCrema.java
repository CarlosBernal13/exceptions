// create the PaletteCrema class that inherits the attributes and methods of the Palette class
class PaletaCrema extends Paleta {
    //the creamy attribute is created
    private boolean cremosa;
    public PaletaCrema(String sabor,double precio,boolean cremosa){
        super(sabor,precio);
        this.cremosa=cremosa;
    }
    // the method showBaseCrema() is created
    public void mostrarBaseCrema(){
            System.out.println("La paleta es cremosa "+ cremosa);
    }
    //create an additional method called bathingInChocolate()
    public void bañarEnChocolate(String fundir){
        System.out.println("Se ha agradado chocolate: "+fundir+" a su paleta cremosa");
    }
    // the changePrice method of the palette class is inherited
    @Override
    public void cambiarPrecio(double cambioPrecio){
        super.cambiarPrecio(cambioPrecio+6.0);
    }
}
