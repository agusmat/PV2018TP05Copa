/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.Imagen;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Agustin
 */
public class ListadoImagen {
    byte[] imagen;
    int numImg;
    Date fecha;
    ArrayList<Imagen> listaImagenes;

    public ListadoImagen() {
        listaImagenes=new ArrayList();    
    }
    public void llenarListado(byte[] imgGuardar){
        if(listaImagenes.isEmpty()){
            numImg=0;
        }
        else{
            numImg=listaImagenes.size();
        }
        listaImagenes.add(new Imagen(numImg, fecha, imgGuardar));
    }
    
}
