
package br.edu.ifnmg.abstractfactory;

//É a fábrica abstrata 

public interface FabricaPersonagem {
    
    Personagem criarPersonagem();
    Arma criarArma();
    
}
