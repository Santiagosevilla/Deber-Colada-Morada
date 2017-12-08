/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.ingredientesColada;
import ec.edu.ister.modelo.ingredientesGuaguas;
import java.util.Scanner;

/**
 *
 * @author SANTIAGO27
 */
public class aplicacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ingredientesColada.Colada();
        System.out.println("\nVa a preparar guaguas de pan\n1) Si\n2) No\n");
        int op=input.nextInt();
        if (op==1) {
            ingredientesGuaguas.guaguas();
        }
        else{
            System.out.println("No va a preparar guaguas de pan");
        }
        System.out.println("\nFin");
    }
}
