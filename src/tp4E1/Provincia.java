package tp4E1;

public class Provincia {
    private String nombre;
    private Pais pais;

    /**Constructor*/
    public Provincia(String nombre) {
        this.nombre = nombre;
    }

    public Provincia(Pais pais) {
        this.pais = pais;
    }

    /**Getter and setter*/
    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}