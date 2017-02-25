/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agómezj.a07.p02;
import java.util.Scanner;


/**
 *
 * @author Alberto
 */
public class SPPAGómezJA07P02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int num;
        //Arreglo
        String [] Telefonos = new String[10];
        Scanner kb = new Scanner (System.in);
        for (int i = 0; i < Telefonos.length; i++){
            System.out.println("Introduzca el número telefonico " + i);
            Telefonos[i] = kb.nextLine();
        }
        System.out.println("Introduzca el número telefono deseado");
        num = kb.nextInt();
        
        if (num < Telefonos.length){
        System.out.println("Número telefónico es " + Telefonos[num]);
        } else 
        System.out.println("Este número esta fuera del rango.");
    }
    
}
