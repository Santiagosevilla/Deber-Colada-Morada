/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO27
 */
public class ingredientesGuaguas {
    public static void guaguas(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese 5 ingredietnes de las guaguas de pan: ");
        String a = input.nextLine();
        String b = input.nextLine();
        String c = input.nextLine();
        String d = input.nextLine();
        String e = input.nextLine();
        System.out.printf("Los ingredientes son: %s, %s, %s, %s, %s",a,b,c,d,e);
    }
}
