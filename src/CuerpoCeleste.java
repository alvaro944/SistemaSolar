import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CuerpoCeleste {
    public enum TipoCuerpoCeleste {
        ESTRELLA, PLANETA, PLANETA_ENANO, LUNA, COMETA, ASTEROIDE
    }
    private String nombre;
    private double periodoOrbital;
    private Set<CuerpoCeleste> satelites;
    private TipoCuerpoCeleste tipoCuerpo;

    public CuerpoCeleste(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.satelites = new HashSet<>();
        this.tipoCuerpo = tipoCuerpo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public TipoCuerpoCeleste getTipoCuerpo() {
        return tipoCuerpo;
    }

    public Set<CuerpoCeleste> getSatelites() {
        return new HashSet<>(satelites); // Devuelve una copia del set de satélites.
    }

    public boolean addSatelites(CuerpoCeleste cuerpoCeleste){
        if(satelites.add(cuerpoCeleste)){
            System.out.println("TRAZA Satelite añadido");
            return true;
        }
        System.out.println("TRAZA el satélite no se ha podido añadir");
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CuerpoCeleste)) return false;
        CuerpoCeleste that = (CuerpoCeleste) o;
        return Objects.equals(nombre, that.nombre) && tipoCuerpo == that.tipoCuerpo;
    }


    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipoCuerpo, 22);
    }

    @Override
    public String toString() {
        return nombre + ": " + tipoCuerpo + ", periodo orbital: " + periodoOrbital;
    }


}
