public class CasaInteligente {
    private FocoInteligente foco;
    private AireAcondicionado aire;
    private Televisor televisor;
    private CerraduraDigital cerradura;
    private BocinaInteligente bocina;
    private ControlRemoto control;

    public CasaInteligente(FocoInteligente foco, AireAcondicionado aire, Televisor televisor,
                           CerraduraDigital cerradura, BocinaInteligente bocina, ControlRemoto control) {
        this.foco = foco;
        this.aire = aire;
        this.televisor = televisor;
        this.cerradura = cerradura;
        this.bocina = bocina;
        this.control = control;
    }

    public static void main(String[] args) {
        // 1. Instanciar dispositivos
        FocoInteligente focoSala = new FocoInteligente("Sala Principal", 50);
        AireAcondicionado aireRecamara = new AireAcondicionado("LG Inverter", 25);
        Televisor tvSala = new Televisor("Samsung 55");
        CerraduraDigital cerraduraEntrada = new CerraduraDigital("Puerta Principal");
        BocinaInteligente bocinaEcho = new BocinaInteligente("Alexa Estudio");

        // 2. Instanciar Control Remoto
        ControlRemoto controlCentral = new ControlRemoto();

        // 3. Registrar dispositivos en el control
        controlCentral.setFoco(focoSala);
        controlCentral.setAire(aireRecamara);
        controlCentral.setTelevisor(tvSala);
        controlCentral.setCerradura(cerraduraEntrada);
        controlCentral.setBocina(bocinaEcho);

        // 4. Instanciar la CasaInteligente
        CasaInteligente miCasa = new CasaInteligente(focoSala, aireRecamara, tvSala, cerraduraEntrada, bocinaEcho, controlCentral);

        // Comprobación de estado inicial
        System.out.println(">>> ESTADO INICIAL DE LA CASA <<<");
        controlCentral.verEstadoActual();

        // Manipulación individual desde main
        System.out.println(">>> MODIFICANDO INDIVIDUALMENTE DESDE MAIN <<<");
        focoSala.encender();
        focoSala.cambiarIntensidad(100);
        focoSala.verEstadoActual();

        // Ejecución de los modos del Control Remoto
        controlCentral.modoBienvenida();
        controlCentral.verEstadoActual();

        controlCentral.modoNoche();
        controlCentral.verEstadoActual();

        controlCentral.modoCine();
        controlCentral.verEstadoActual();
    }
}