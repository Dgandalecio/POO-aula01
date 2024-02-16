/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.luhn;

import java.util.Scanner;

/**
 *
 * @author diogo
 */
public class Luhn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       String num = scanner.nextLine();

        boolean valido = validar(num);
        
        if (valido) {
            System.out.println("O número é válido");
        }
        else {
            
            System.out.println("O número não é válido");
            
        }

        
    }

    private static boolean validar(String num) {
         num = num.replaceAll("\\s+", "");
        if (!num.matches("\\d+")) {
            return false;
        }

        int soma = 0;
        boolean dobrar = false;


        for (int i = num.length() - 1; i >= 0; i--) {
        int digito = num.charAt(i) - '0'; 

          if (dobrar) {
                digito *= 2;
                
          if (digito > 9) {
                digito -= 9;
                }
            }

        soma += digito;
        dobrar = !dobrar;
        }
        
        return soma % 10 == 0;
    }
    }

