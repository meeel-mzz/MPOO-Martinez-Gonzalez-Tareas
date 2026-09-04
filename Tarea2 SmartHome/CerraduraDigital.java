public class CerraduraDigital {
    private String ubicacion;
    private boolean bloqueada;
    private int porcentajeBateria;

    public CerraduraDigital(String ubicacion) {
        this.ubicacion = ubicacion;
        this.bloqueada = true;
        this.porcentajeBateria = 100;
    }

    public void bloquear() {
        this.bloqueada = true;
    }

    public void desbloquear() {
        this.bloqueada = false;
        this.porcentajeBateria -= 1;
    }

    public boolean requiereCambioBateria() {
        return porcentajeBateria < 15;
    }

    public void verEstadoActual() {
        System.out.println("Cerradura [" + ubicacion + "] | Bloqueada: " + bloqueada + " | Batería: " + porcentajeBateria + "%");
    }

    public boolean isBloqueada() { return bloqueada; }
}