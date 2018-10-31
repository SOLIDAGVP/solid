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
public abstract class Pokemon {
    private String nombre;
    private String tipo;
    private String habilidad;
    private double porcentajeVida;
    private String ataque;
    private double dañoAtaque;
    
    
    public Pokemon() {
        
    }

    public Pokemon(String nombre, String tipo, String habilidad,String ataque,double dañoAtaque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.porcentajeVida=100;
        this.ataque=ataque;
        this.dañoAtaque=dañoAtaque;
    }
    
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public double getDañoAtaque() {
        return dañoAtaque;
    }

    public void setDañoAtaque(double dañoAtaque) {
        this.dañoAtaque = dañoAtaque;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public double getPorcentajeVida() {
        return porcentajeVida;
    }

    public void setPorcentajeVida(double porcentajeVida) {
        this.porcentajeVida = porcentajeVida;
    }

    
  
    
    
    
    
    
    
    
}
