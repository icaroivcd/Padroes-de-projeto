/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.abstractfactory;

//Produto Concreto

public class Cajado implements Arma{
    
    @Override
    public void exibirInfo() {
        System.out.println("Arma Cajado criada!");
    }
 
}
