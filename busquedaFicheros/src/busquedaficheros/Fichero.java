/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedaficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maria
 */
public class Fichero {
    private String nombre;
    private File fichero;
    
    public Fichero(String nombre) {
        this.nombre = nombre;
        this.fichero = new File(nombre);
        PrintWriter escribir=null;
        if (!fichero.exists()) {
            try {
                fichero.createNewFile();
            } catch (IOException ex) {
                System.out.println("El fichero no existe");
            }
        }
    }
    
    //MOSTRAR ALUMNOS
    public static void mostrar(String nombreFichero, int longitudLinea){
        Scanner leer = null;
        File f = new File(nombreFichero);
        String nip, nombre, leer2;
        
        while (leer.hasNext()){
                leer2 = leer.nextLine();
                //OBTENER NIP
                nip = leer2.substring(0,6);
                //OBTENER NOMBRE
                nombre = leer2.substring(7);
                //SEPARAR
                for (int i = leer2.length(); i <= longitudLinea; i++){
                    if (i == longitudLinea){
                        System.out.println(nombre+" "+"*"+nip);
                    }
                }
            }
    }
    //BUSCAR ALUMNOS
    public static void buscarAlumno(String nip){
        File f = new File("Alumnos.txt");
        Scanner leer = null;
        String leer2;
        boolean encontrado=false;
        try {
            leer = new Scanner(f);
            while(leer.hasNext()){
                leer2 = leer.next();
                if(leer2.substring(0,6).equals(nip)){
                    System.out.println(leer2.substring(7));
                    encontrado=true;
                }
            }
            if(!encontrado){
                System.out.println("El alumno no existe");
            }
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");
        }
    }

    //INSERTAR ALUMNOS UTILIZANDO FileWriter - PrintWriter
    public static void insertarAlumnos(String nombre, String nip){
        File f = new File("Alumnos.txt");
        Scanner leer = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Alumnos.txt",true);
            pw = new PrintWriter(fw);
            leer = new Scanner(f);
            pw.println(nip+" "+nombre);
        } catch (IOException ex) {
            //Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error fichero");
        } finally{
            try{
                if(fw!= null){
                    fw.close();
                }
            }catch (Exception e2){
                        System.out.println("No cerraste");
            }
        }
    }
    
}
