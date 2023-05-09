package tp4E1;

import java.util.HashSet;
import java.util.Set;
public class Pais {
    private String nombre;
    private String capital;
    private Continente continente;
    private Set<Provincia> provincias;

    /**Constructor*/
    public Pais(String nombre, String capital, Continente continente) {
        this.nombre = nombre;
        this.capital = capital;
        this.continente = continente;
        this.provincias = new HashSet<>();
        continente.agregarPais(this);
    }
    /**Getter and setter*/
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public Continente getContinente() {
        return continente;
    }
    public void setContinente(Continente continente) {
        this.continente = continente;
    }
    public Set<Provincia> getProvincias() {
        return provincias;
    }
    public void setProvincias(Set<Provincia> provincias) {
        this.provincias = provincias;
    }
}