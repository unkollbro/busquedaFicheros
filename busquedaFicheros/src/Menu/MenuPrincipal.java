/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class MenuPrincipal {
    public static int mostrarMenu(){
    Scanner leer = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("1. Ver Alumnos");
            System.out.println("2. Buscar Alumnos");
            System.out.println("3. Insertar Alumnos");
            System.out.println("4. Salir");
            opc = leer.nextInt();
        }while(opc<1 || opc>4);
        return opc;
    }
}
