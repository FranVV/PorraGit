/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import java.util.LinkedList;

/**
 *
 * @author alumno
 */
public class Juego {
     private LinkedList<Apostante> vApostante;

    public Juego() {
        this.vApostante = new LinkedList<>();
    }
    //true nombre repetido, false apostante introducido con exito
    public boolean comprobarNombre(String nombre,int local,int visitante,boolean pagado){
        Apostante  nuevo = new Apostante(nombre, local, visitante,pagado);
        if (vApostante.contains(nuevo)){
            return true;
        }else{
            vApostante.add(nuevo);
        return false;
        }
        
    
    }

    /**
     * @return the vApostante
     */
    public LinkedList<Apostante> getvApostante() {
        return vApostante;
    }

    /**
     * @param vApostante the vApostante to set
     */
    public void setvApostante(LinkedList<Apostante> vApostante) {
        this.vApostante = vApostante;
    }

    
     
     
}
