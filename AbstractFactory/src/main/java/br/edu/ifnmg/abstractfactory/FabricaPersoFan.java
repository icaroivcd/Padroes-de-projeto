/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.abstractfactory;

/**
 *
 * @author Ícaro Viníciua &lt;Ícaro Vinícius at ifnmg.edu.br&gt;
 */
public class FabricaPersoFan implements FabricaPersonagem {
    
    @Override
    public Personagem criarPersonagem() {
        return new Mago();
    }

    @Override
    public Arma criarArma() {
        return new Cajado();
    }
    
}
