
package celular;

import java.util.Scanner;

public class Celular {
    Scanner ent=new Scanner(System.in);
    String Nombre;
    String color;
    String color2;
    String llamar;

    public Celular(String Nombre, String color) {
        this.Nombre = Nombre;
        this.color = color;
    }

    public Celular() {
    }
    public void llamar(){
        System.out.println("Usted desea llamar a: ");
        llamar=ent.nextLine();
        System.out.println("de color : ");
        color2=ent.nextLine();      
    }
    public void mostrar(){
        System.out.println("Llamando de "+llamar+" - "+color2);
        System.out.println("Llamando de "+Nombre+" - "+color);
        System.out.println("---------------------------------------------");
    }
    public void detalle(){
        System.out.println("Nombre: "+Nombre);
        System.out.println("Color: "+color);
        System.out.println("---------------------------------------------");
    }
    
    
    
    

     
}
