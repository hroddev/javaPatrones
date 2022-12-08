package BehavioralDesignPattern.State;

import StructuralDesignPattern.Decorator.Telephone;

public class EstadoBloqueado extends Estado {

    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "descloquear(): movil desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamar(): La camara esta bloqueada. Desbloquea el movil antes";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto(): La camara esta bloqueada. Desbloquea el movil antes";
    }
}
