package tp4E1;


import java.util.ArrayList;

public class Continente {
    private String nombre;
    private ArrayList<Pais> paises;
    public Continente(String nombre) {
        this.nombre = nombre;
        paises = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Pais> getPaises() {
        return paises;
    }
    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }
    public void agregarPais(Pais pais) {
        paises.add(pais);
    }

}
