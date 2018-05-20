/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.datos.ListaLibros;
import aplicacion.modelo.dominio.Libro;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Agustin
 */
@ManagedBean
@ViewScoped
public class LibrosManagedBean {

    private String titulo;
    private String autor;
    private String precio;
    private String isbn;
    private ListaLibros listadoLibros;
    private ListaLibros listadoLibrosAux;
    private String tituloABuscar;

    /**
     * Creates a new instance of LibrosManagedBean
     */
    public LibrosManagedBean() {
        listadoLibros = new ListaLibros();
        listadoLibrosAux = new ListaLibros();
    }

    public void agregarLibro() {
        getListadoLibros().getListaLibros().add(new Libro(getTitulo(), getAutor(), getPrecio(), getIsbn()));
    }

    public void buscarLibro() {
        for (int i = 0; i < getListadoLibros().getListaLibros().size(); i++) {
            if (getListadoLibros().getListaLibros().get(i).getTitulo().equals(getTituloABuscar())) {
                getListadoLibrosAux().getListaLibros().add(getListadoLibros().getListaLibros().get(i));
            }
        }
    }

    public void reinciar() {
        setListadoLibros(new ListaLibros());
        setListadoLibrosAux(new ListaLibros());
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the listadoLibros
     */
    public ListaLibros getListadoLibros() {
        return listadoLibros;
    }

    /**
     * @param listadoLibros the listadoLibros to set
     */
    public void setListadoLibros(ListaLibros listadoLibros) {
        this.listadoLibros = listadoLibros;
    }

    /**
     * @return the listadoLibrosAux
     */
    public ListaLibros getListadoLibrosAux() {
        return listadoLibrosAux;
    }

    /**
     * @param listadoLibrosAux the listadoLibrosAux to set
     */
    public void setListadoLibrosAux(ListaLibros listadoLibrosAux) {
        this.listadoLibrosAux = listadoLibrosAux;
    }

    /**
     * @return the tituloABuscar
     */
    public String getTituloABuscar() {
        return tituloABuscar;
    }

    /**
     * @param tituloABuscar the tituloABuscar to set
     */
    public void setTituloABuscar(String tituloABuscar) {
        this.tituloABuscar = tituloABuscar;
    }
}
