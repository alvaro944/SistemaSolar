public class Planeta extends CuerpoCeleste{
    public Planeta(String nombrePlaneta, double periodoOrbital){
        super(nombrePlaneta, periodoOrbital, TipoCuerpoCeleste.PLANETA);
    }

    @Override
    public boolean addSatelites(CuerpoCeleste satelite) {
        if(satelite.getTipoCuerpo() == TipoCuerpoCeleste.LUNA){
            return super.addSatelites(satelite);
        }
        return false;
    }
}
