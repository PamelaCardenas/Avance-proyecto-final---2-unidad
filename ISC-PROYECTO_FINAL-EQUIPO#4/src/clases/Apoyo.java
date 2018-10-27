/*
 * Ayudará como apoyo para ordenar los datos, acomodarlos para ser mostrados en el balance general
 */
package clases;

import com.toedter.calendar.JDateChooser;
import java.util.Calendar;

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 *         Josué David Martínez García 18550360
 *         Brayan Salvador Saenz Prieto 18550339
 *         Oscar Aron Romero Camacho 18550377
 */

public class Apoyo {
    
    //Creacion de Nodos (Objetos creados de una clase Auto-Referenciada) y variables estáticas
     static Nodo inicio = null;
     static Nodo fin = null;
     static Nodo aux = null;
     static Nodo aux1=null;
     static Nodo aux2=null;
     static Nodo Nuevo;
     static String lista;
     
     //Clase estática llamada Nodo
     public static class Nodo{
         //Atributos y Nodos
    double cantidad;
    String Nombre;
    Nodo sig;
    Nodo ant;

        //Contructor que tiene las variables cantidad y nombre
        public Nodo(double cantidad, String Nombre) {
            this.cantidad = cantidad;
            this.Nombre = Nombre;
            sig = null;
            ant=null;
            
            
            System.out.println();
        }
    
}
     //Método llamado Nuevo que guarda el valor de un nuevo Nodo
     public static void Nuevo (double c, String N){
         Nuevo = new Nodo(c, N);
     }
     
}


