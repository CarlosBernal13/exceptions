// inherits from parent class naming Character using extends
 class Enemigo extends Personaje {
     //create an additional attribute called type
     private String tipo;
     public Enemigo(String nombre,int nivel,String tipo){
         //inherits the name and level of the Character class
         super(nombre,nivel);
         this.tipo=tipo;
     }
     //create the scream() method
     public void gritar(){
         System.out.println(nombre +" "+tipo+ " gruñeee !!grrrrrrrra!!");
     }
}
