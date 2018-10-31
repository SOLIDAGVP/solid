/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1ocp.bien;

import _1ocp.mal.*;

/**
 *
 * @author Palacios
 */
public class ManejadorAtaque {
    private final Pokemon pokemon;
    private final Pokemon atacante;

    public ManejadorAtaque(Pokemon pokemon,Pokemon atacante) {
        this.pokemon = pokemon;
        this.atacante=atacante;
    }
    
    public void manejarAtaque(final Pokemon atacante){
            if(pokemon.getAtaque().equals(atacante.getAtaque())){
                pokemon.setPorcentajeVida(pokemon.getPorcentajeVida()-atacante.getDañoAtaque());
            }
            /*Cuando queremos agregar otro ataque (ej: ATAQUE_ROCA), tenemos que cambiar dos clases
              ManejadorAtaque y Ataque y esto viola el Principio Open Close
            */
        
    }
}
