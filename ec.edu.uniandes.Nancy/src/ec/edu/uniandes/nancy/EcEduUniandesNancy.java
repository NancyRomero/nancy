/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.nancy;
import java.util.ArrayList;

/**
 *
 * @author windows 8
 */
public class EcEduUniandesNancy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<clsProducto> prod=new ArrayList<clsProducto>();
        clsProducto prod1=new clsProducto (1,"clavo",20,clsProducto.unidad.libras);
        clsProducto prod2=new clsProducto (2,"aceite",10,clsProducto.unidad.litro);
        clsProducto prod3=new clsProducto (1,"zinc",5,clsProducto.unidad.metro);
        
        prod.add(prod1);
        prod.add(prod2);
        prod.add(prod3);
         imprimir (prod);
    }
    private static void imprimir (ArrayList<clsProducto>prod){
        for (clsProducto producto :prod){
            System.out.println("**********");
            System.out.println("  Id:"+producto.getId());
            System.out.println("  Nombre:"+producto.getNombre());
            System.out.println("  valor:"+producto.getValor());
            System.out.println("  unidad:"+producto.getUnidad());
        }
    }
}
