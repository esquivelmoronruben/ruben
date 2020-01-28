/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruben.array_libro;

/**
 *
 * @author AlumnoTarde
 */
public class Mislibros {

    public static void main(String[] args) {

        Integer[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        Util<Integer> u = new Util<>();
        
        u.invertir(numeros);
        
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        Libro[] Mislibros = new Libro[10];
        
        Mislibros[0] = new Libro ("Lost", "paco");
        Mislibros[1] = new Libro ("libro1", "paco");
        Mislibros[2] = new Libro ("titulo2", "paco");
        Mislibros[3] = new Libro ("titulo3", "paco");
        Mislibros[4] = new Libro ("titulo4", "paco");
        Mislibros[5] = new Libro ("titulo5", "paco");
        Mislibros[6] = new Libro ("titulo6", "paco");
        Mislibros[7] = new Libro ("titulo7", "paco");
        Mislibros[8] = new Libro ("titulo8", "paco");
        Mislibros[9] = new Libro ("titulo9", "paco");
        
    }
}
