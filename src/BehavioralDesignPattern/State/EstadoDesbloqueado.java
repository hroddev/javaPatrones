package BehavioralDesignPattern.State;

import StructuralDesignPattern.Decorator.Telephone;

public class EstadoDesbloqueado extends Estado {

    public EstadoDesbloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {

        return "desbloquear(): Ya esta desbloqueado";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));
        return "abrirCamara(): Puedes hacer la foto";
    }

    @Override
    public String hacerFoto() {

        return "hacerFoto(): no se puede hacer la foto, abrir la camara primero";
    }
}