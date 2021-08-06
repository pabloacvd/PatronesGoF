package ar.com.xeven.patronesgof;

public class SoporteTecnicoPremium implements SoporteTecnico{
    @Override
    public String obtenerSoporte() {
        return "Soporte premium para clientes VIP!";
    }
}
