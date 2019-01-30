/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedaficheros;

import Menu.MenuPrincipal;
import java.util.Scanner;

/**
 *
 * @author maria
 */
public class BusquedaFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        do{
            opc = MenuPrincipal.mostrarMenu();
            switch(opc){
                //1. Ver Alumnos
                case 1: break;
                //2. Buscar Alumnos
                case 2: break;
                //3. Insertar Alumnos
                case 3: break;
                //4. Salir
                case 4: break;
            }
        }while (opc != 4);
    }
    
}
