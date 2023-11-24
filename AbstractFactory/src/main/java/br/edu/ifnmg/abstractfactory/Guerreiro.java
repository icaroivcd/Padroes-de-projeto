
package br.edu.ifnmg.abstractfactory;

//Produto concreto

public class Guerreiro implements Personagem {
    
    @Override
    public void exibirInfo() {
        System.out.println("Personagem Guerreiro criado!");
    }
    
}
