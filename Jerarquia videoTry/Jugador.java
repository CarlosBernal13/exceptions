 // inherits from parent class naming Character using extends
 class Jugador extends Personaje {
    //create an additional attribute called class
     private String clase;
     public Jugador(String nombre,int nivel,String clase){
         //inherits the name and level of the Character class
         super(nombre,nivel);
         this.clase=clase;
     }
    // create the method useSpecialAbility()
    public void usarHabilidadEspecial(){
        System.out.println( clase+" "+nombre+" use special ability ");
    }
}
