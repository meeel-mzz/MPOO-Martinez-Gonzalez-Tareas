public class ControlRemoto {
    private FocoInteligente foco;
    private AireAcondicionado aire;
    private Televisor televisor;
    private CerraduraDigital cerradura;
    private BocinaInteligente bocina;

    public void setFoco(FocoInteligente foco) { this.foco = foco; }
    public void setAire(AireAcondicionado aire) { this.aire = aire; }
    public void setTelevisor(Televisor televisor) { this.televisor = televisor; }
    public void setCerradura(CerraduraDigital cerradura) { this.cerradura = cerradura; }
    public void setBocina(BocinaInteligente bocina) { this.bocina = bocina; }

    public void modoBienvenida() {
        System.out.println("\n--- EJECUTANDO: MODO BIENVENIDA ---");
        if (cerradura != null) cerradura.desbloquear();
        if (foco != null) {
            foco.encender();
            foco.cambiarIntensidad(80);
        }
        if (aire != null) {
            aire.encender();
            aire.ajustarTemperatura(22);
        }
        if (bocina != null) {
            bocina.reproducirMusica();
            bocina.ajustarVolumen(30);
        }
    }

    public void modoNoche() {
        System.out.println("\n--- EJECUTANDO: MODO NOCHE ---");
        if (televisor != null) televisor.apagar();
        if (bocina != null) bocina.pausarMusica();
        if (foco != null) foco.cambiarIntensidad(10);
        if (aire != null) aire.ajustarTemperatura(24);
        if (cerradura != null) cerradura.bloquear();
    }

    public void modoCine() {
        System.out.println("\n--- EJECUTANDO: MODO CINE ---");
        if (foco != null) {
            foco.encender();
            foco.cambiarIntensidad(15);
        }
        if (televisor != null) {
            televisor.encender();
            televisor.cambiarVolumen(40);
        }
        if (bocina != null) {
            bocina.reproducirMusica();
            bocina.ajustarVolumen(50);
        }
        if (aire != null) aire.ajustarTemperatura(20);
    }

    public void verEstadoActual() {
        System.out.println("\n====== ESTADO GENERAL DE LA CASA ======");
        if (foco != null) foco.verEstadoActual();
        if (aire != null) aire.verEstadoActual();
        if (televisor != null) televisor.verEstadoActual();
        if (cerradura != null) cerradura.verEstadoActual();
        if (bocina != null) bocina.verEstadoActual();
        System.out.println("=======================================\n");
    }
}