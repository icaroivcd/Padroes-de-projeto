/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.abstractfactory;

/**
 *
 * @author Ícaro Viníciua &lt;Ícaro Vinícius at ifnmg.edu.br&gt;
 */
public class Cliente {

    public static void main(String[] args) {
        
        // Utilizando a Fábrica Abstrata
        FabricaPersonagem fabrica = new FabricaPersoFan();
        Personagem personagem = fabrica.criarPersonagem();
        Arma arma = fabrica.criarArma();

        // Exibindo informações
        personagem.exibirInfo();
        arma.exibirInfo();
    }
   }

