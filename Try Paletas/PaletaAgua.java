// create the PaletteWater class that inherits the attributes and methods of the Palette class
class PaletaAgua extends Paleta {
    //the Waterbase attribute is created
    private boolean baseAgua;
    public PaletaAgua(String sabor,double precio,boolean baseAgua){
        //inherits flavor and price attributes from the Palette class
        super(sabor, precio);
        this.baseAgua=baseAgua;
    }
    // create the method showBaseAgua
    public void mostrarBaseAgua(){
        System.out.println("Es base agua " +baseAgua);
    }
    //add an extra method called addPlugin
    public void agregarComplemento(String complemento){
        System.out.println("se han agregado: "+ complemento +" a tu paleta");

    }
    //override the changePrice method
    @Override
    public void cambiarPrecio(double cantidad){
        super.cambiarPrecio(cantidad+2.0);
    }
}
