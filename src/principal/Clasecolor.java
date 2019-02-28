
package principal;
import clasecolor.profesor;
public class Clasecolor {

   public static void main(String[] args) {
    profesor teacher = new profesor();
    String color = teacher.preguntacolor();
    System.out.println("La respuesta recibida es:" + color);
    }
    
}
