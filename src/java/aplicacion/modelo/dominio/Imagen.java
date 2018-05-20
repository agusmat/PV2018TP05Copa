/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Agustin
 */
public class Imagen implements Serializable {
    private int numImg;
    private Date fecha;
    private byte[] imagen;

    public Imagen() {
    }

    public Imagen(int numImg, Date fecha, byte[] imagen) {
        this.numImg = numImg;
        this.fecha = fecha;
        this.imagen = imagen;
    }

    /**
     * @return the numImg
     */
    public int getNumImg() {
        return numImg;
    }

    /**
     * @param numImg the numImg to set
     */
    public void setNumImg(int numImg) {
        this.numImg = numImg;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the imagen
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    
}
