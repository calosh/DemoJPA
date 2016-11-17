/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.dcce.sic.arqapp.demojpa.model;

import javax.persistence.Entity;

/**
 *
 * @author SALAS
 */

 
@Entity
public class ProyectoProgramacion extends Proyecto{
    private String urlGit;
    private String proyectoPorgramcion;
    
    
    public ProyectoProgramacion(){
        
    }

    /**
     * @return the urlGit
     */
    public String getUrlGit() {
        return urlGit;
    }

    /**
     * @param urlGit the urlGit to set
     */
    public void setUrlGit(String urlGit) {
        this.urlGit = urlGit;
    }

    /**
     * @return the proyectoPorgramcion
     */
    public String getProyectoPorgramcion() {
        return proyectoPorgramcion;
    }

    /**
     * @param proyectoPorgramcion the proyectoPorgramcion to set
     */
    public void setProyectoPorgramcion(String proyectoPorgramcion) {
        this.proyectoPorgramcion = proyectoPorgramcion;
    }
}
