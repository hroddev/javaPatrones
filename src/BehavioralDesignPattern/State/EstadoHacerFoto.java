package BehavioralDesignPattern.State;

import StructuralDesignPattern.Decorator.Telephone;

public class EstadoHacerFoto extends Estado{

    public EstadoHacerFoto(Telefono telephone) {
        super(telephone);
    }

    @Override
    public String desbloquear() {
        return "Movil desbloquedo";
    }

    @Override
    public String abrirCamara() {
        return "Ya estaba abierta";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoBloqueado(telefono));
        return "La foto se ha hecho";
    }
}
