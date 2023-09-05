class Personaje{
    // create the variables to be filled
    protected String nombre;
    protected int nivel;
    // create the constructor
    public Personaje(String nombre,int nivel){
        if(nivel<1){
            throw new IllegalArgumentException("El nivel no puede ser menor que 1");
        }
        this.nombre=nombre;
        this.nivel=nivel;
    } 
    // set the getter and setter methods
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){
        this.nivel=nivel;
    }
    // create the attack() method
    public void atacar(){
        if(nivel>=1&&nivel<5){
            // a RuntimeException type exception is generated
            throw new RuntimeException("El nivel debe de ser minimo 5 para atacar");
        }
        System.out.println(nombre+" nivel "+nivel+" ataca");
    }
}