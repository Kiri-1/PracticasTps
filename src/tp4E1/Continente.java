package tp4E1;


import java.util.ArrayList;
import java.util.List;

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
    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }

    /**Metodos**/
    public void agregarPais(Pais pais) {
        paises.add(pais);
    }

    public ArrayList<Pais> getPaises(){
        List<Pais> paises = new ArrayList<>();
        for (Pais pais : this.paises){
            paises.add(pais);
        }
        return getPaises();
    }

}
