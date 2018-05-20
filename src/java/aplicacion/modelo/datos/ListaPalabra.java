/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import java.util.ArrayList;

/**
 *
 * @author Agustin
 */
public class ListaPalabra {
    private ArrayList<String> listadoPalabra;

    public ListaPalabra() {
        listadoPalabra=new ArrayList();
    }

    public ListaPalabra(ArrayList<String> listadoPalabra) {
        this.listadoPalabra = listadoPalabra;
    }

    /**
     * @return the listadoPalabra
     */
    public ArrayList<String> getListadoPalabra() {
        return listadoPalabra;
    }

    /**
     * @param listadoPalabra the listadoPalabra to set
     */
    public void setListadoPalabra(ArrayList<String> listadoPalabra) {
        this.listadoPalabra = listadoPalabra;
    }
    
}
