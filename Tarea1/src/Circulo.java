/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgar
 */
public class Circulo {
    
    double radio = -1;
    
    {
     if (radio<0)
            System.out.println("No se aceptan numeros negativos");
            System.out.println("Ingresa otro numero");
     else
            System.out.println("El radio es: "+ radio);
    }
    
}
