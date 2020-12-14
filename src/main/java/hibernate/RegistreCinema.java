/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.Date;


public class RegistreCinema {
   
    private Integer idPelicula;
    private double duracionPelicula;
    private boolean pelicula3D;
    private char salaCine;
    private String nombrePelicula;
    private Date fechaEstreno;

    public RegistreCinema() {
    }

   
    public RegistreCinema(Integer idPelicula, double duracionPelicula, boolean pelicula3D, char salaCine, String nombrePelicula, Date fechaEstreno) {
        this.idPelicula = idPelicula;
        this.duracionPelicula = duracionPelicula;
        this.pelicula3D = pelicula3D;
        this.salaCine = salaCine;
        this.nombrePelicula = nombrePelicula;
        this.fechaEstreno = fechaEstreno;
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public double getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(double duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    public boolean isPelicula3D() {
        return pelicula3D;
    }

    public void setPelicula3D(boolean pelicula3D) {
        this.pelicula3D = pelicula3D;
    }

    public char getSalaCine() {
        return salaCine;
    }

    public void setSalaCine(char salaCine) {
        this.salaCine = salaCine;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    @Override
    public String toString() {
        return "RegistreCinema{" + "duracionPelicula=" + duracionPelicula + ", pelicula3D=" + pelicula3D + ", salaCine=" + salaCine + ", nombrePelicula=" + nombrePelicula + ", fechaEstreno=" + fechaEstreno + '}';
    }
    
    
}
