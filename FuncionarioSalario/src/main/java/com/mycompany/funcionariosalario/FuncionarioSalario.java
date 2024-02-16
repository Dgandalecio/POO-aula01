/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.funcionariosalario;
import java.util.Scanner;
/**
 *
 * @author diogo
 */
public class FuncionarioSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String funcionario;
        double salario;
        int faltas;
        int produto;
        double desconto= 0;
        int bonus;
        int bonustotal;
        double salariototal;
        
        
            
        System.out.println("Digite o nome do funcionario!");
        funcionario= scanner.nextLine();
        
        
        System.out.println("Digite o valor do salario!");
        salario = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Quantidade de faltas do funcionario?");
        faltas= scanner.nextInt();
        
              if (faltas>5){
                  desconto= salario *0.15;
                  salario -= desconto;
              }
        
        System.out.println("Produtos vendidos?");
        produto = scanner.nextInt();
        
            if(produto> 20){
            bonus = 13;
            
        }
            else{
            bonus= 10;
           
        }
        
       bonustotal= produto*bonus ;
       salariototal= salario + bonustotal;
        
        
        System.out.println("Funcionario:"+funcionario);
        System.out.println("Salario:"+salariototal);
        System.out.println("faltas:"+faltas);
        System.out.println("Produtos:"+ produto);
        System.out.println("bonus:"+ bonustotal);
        System.out.println("desconto:"+ desconto);
             
}
}
