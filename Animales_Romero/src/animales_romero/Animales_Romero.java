/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales_romero;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
   import java.util.Date;
   import java.util.Locale;


/**
 *
 * @author windows 8
 */
public class Animales_Romero {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Animales_Nancy> animal = new ArrayList<Animales_Nancy>();
        
        
        Animales_Nancy a0= new Animales_Nancy(1,"Gato",null,30,Animales_Nancy.clase.Vertebrado,Animales_Nancy.tipo.mamiferos);
        Animales_Nancy a1= new Animales_Nancy(2,"Oso",null,856,Animales_Nancy.clase.Vertebrado,Animales_Nancy.tipo.mamiferos);
        Animales_Nancy a2= new Animales_Nancy(3,"Perro",null,235,Animales_Nancy.clase.Vertebrado,Animales_Nancy.tipo.mamiferos);
        Animales_Nancy a3= new Animales_Nancy(4,"Tortuga",null,35,Animales_Nancy.clase.Vertebrado,Animales_Nancy.tipo.oviparos);
        Animales_Nancy a4= new Animales_Nancy(5,"Pescado",null,5,Animales_Nancy.clase.Vertebrado,Animales_Nancy.tipo.oviparos);
        Animales_Nancy a5= new Animales_Nancy(6,"Pollo",null,50,Animales_Nancy.clase.Vertebrado,Animales_Nancy.tipo.oviparos);
        Animales_Nancy a6= new Animales_Nancy(7,"Leone",null,3245,Animales_Nancy.clase.Vertebrado,Animales_Nancy.tipo.mamiferos);
        Animales_Nancy a7= new Animales_Nancy(8,"Mono",null,654,Animales_Nancy.clase.Vertebrado,Animales_Nancy.tipo.mamiferos);
        Animales_Nancy a8= new Animales_Nancy(9,"Hanster",null,6,Animales_Nancy.clase.Vertebrado,Animales_Nancy.tipo.mamiferos);
        Animales_Nancy a9= new Animales_Nancy(10,"Palomas",null,14,Animales_Nancy.clase.Vertebrado,Animales_Nancy.tipo.oviparos);
       
        animal.add(a0);
        animal.add(a1);
        animal.add(a2);
        animal.add(a3);
        animal.add(a4);
        animal.add(a5);
        animal.add(a6);
        animal.add(a7);
        animal.add(a8);
        animal.add(a9);
        
        imprimir(animal);
        
        }
      public static void imprimir(ArrayList<Animales_Nancy> p)
        {
            for (Animales_Nancy animal : p) {
                
        System.out.println("******************"); 
        System.out.println("Id: " + animal.Id());    
        System.out.println("Nombre: " + animal.Nombre());
        //System.out.println("Nacimiento: " + animal.getApareamiento());
        System.out.println("Peso: " + animal.Peso());
        System.out.println("Clase: " + animal.Clase());
        System.out.println("Tipo: " + animal.Tipo());
        System.out.println("");
         Date d=new Date();
        System.out.println("Fecha: "+d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
        
        
        
        }
    }
}


