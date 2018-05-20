/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.datos.ListaPalabra;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Agustin
 */
@ManagedBean
@ViewScoped
public class PalabrasManagedBean implements Serializable {
    private String palabraIngresada;
    private ListaPalabra listadoPalabra;
    ListaPalabra listadoPalabraAux;
    

    /**
     * Creates a new instance of PalabrasManagedBean
     */
    public PalabrasManagedBean() {
        listadoPalabra=new ListaPalabra();
        listadoPalabraAux=new ListaPalabra();
    }
    public void agregarPalabra(){
        for(int i=0;i<listadoPalabra.getListadoPalabra().size();i++){
            if(listadoPalabra.getListadoPalabra().get(i).charAt(0)>=palabraIngresada.charAt(0)){
                for(int j=i;j<listadoPalabra.getListadoPalabra().size();j++){
                    listadoPalabraAux.getListadoPalabra().add(listadoPalabra.getListadoPalabra().get(j));
                    listadoPalabra.getListadoPalabra().remove(j);
                }

            }
        }
        listadoPalabra.getListadoPalabra().add(palabraIngresada);
        for(int h=0;h<listadoPalabraAux.getListadoPalabra().size();h++){
            listadoPalabra.getListadoPalabra().add(listadoPalabraAux.getListadoPalabra().get(h));
        }
        listadoPalabraAux.getListadoPalabra().clear();   
    }

    /**
     * @return the palabraIngresada
     */
    public String getPalabraIngresada() {
        return palabraIngresada;
    }

    /**
     * @param palabraIngresada the palabraIngresada to set
     */
    public void setPalabraIngresada(String palabraIngresada) {
        this.palabraIngresada = palabraIngresada;
    }

    /**
     * @return the listadoPalabra
     */
    public ListaPalabra getListadoPalabra() {
        return listadoPalabra;
    }

    /**
     * @param listadoPalabra the listadoPalabra to set
     */
    public void setListadoPalabra(ListaPalabra listadoPalabra) {
        this.listadoPalabra = listadoPalabra;
    }
}
