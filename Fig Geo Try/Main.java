public class Main {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("\t Figuras Geometricas");
	    System.out.println(" Figura\t\t Area");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
       //we create the figures and enter data to calculate the area of each figure and print the result
        //in table form
        Circulo circulo = new Circulo("Circulo", 23.6);
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 45, 12);
        Triangulo triangulo = new Triangulo("Triangulo", 67, 45,23,67);
        //create the try catch methods that throw the exceptions
        try {
            System.out.println("" + rectangulo.nombre + "\t\t" + rectangulo.calcularArea()+"\t\t\t"+rectangulo.calcularPerimetro());
            System.out.println("" + circulo.nombre + "\t\t\t" + circulo.calcularArea()+"\t"+circulo.calcularPerimetro());
            System.out.println("" + triangulo.nombre + "\t\t" + triangulo.calcularArea()+"\t\t\t"+triangulo.calcularPerimetro());
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
