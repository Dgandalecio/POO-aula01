/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.variosnumeros;

import java.util.Scanner;

/**
 *
 * @author diogo
 */
public class VariosNumeros {

    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
        
        int num;
        int quantnum = 0;
        int maiornum = Integer.MIN_VALUE;
        int menornum = Integer.MAX_VALUE;
        int medianum = 0;
        int somanum = 0;
        
        System.out.println("Digite quantos numeros quiser!");
        
        while(true){
        
        num = scanner.nextInt();    
        if(num == -1){
            
            break;
        }
        somanum+=num;
        quantnum++;
        
        if(num>maiornum){
            maiornum=num;
            
        }
        
        if(num<menornum){
            menornum=num;
        }
        }
        if (quantnum > 0){
            
           medianum= somanum/quantnum;
        }
        
         System.out.println("Quantidade de números:" + quantnum);
         System.out.println("Maior número:" + maiornum);
         System.out.println("Menor número:" + menornum);
         System.out.println("Média dos números:" + medianum);
        
    }
}
