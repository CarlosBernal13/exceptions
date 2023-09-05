public class Main {
    public static void main(String[] args) {
        Jugador jugador=new Jugador("Tauro", 56, "Guerrero");
        Jugador jugador1=new Jugador("Dorse", 10, "Mago");
        Jugador jugador2=new Jugador("Lancelot", 9, "Arquero");
        Enemigo enemigo=new Enemigo("Minotauro", 7, "Esqueleto");
        Enemigo enemigo1=new Enemigo("Clovedeo", 3, "Dragón");
        Enemigo enemigo2=new Enemigo("Pelayo", 12, "Orco");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //create the try catch method
        try {
            enemigo2.gritar();
            jugador.usarHabilidadEspecial(); 
            enemigo1.atacar();

        } catch (RuntimeException e) {
            // send an error message
            System.out.println("Error: " + e.getMessage());
        }
    }
}
