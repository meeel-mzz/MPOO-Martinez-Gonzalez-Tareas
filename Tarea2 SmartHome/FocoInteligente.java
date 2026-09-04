public class FocoInteligente {
    private String ubicacion;
    private boolean encendido;
    private int intensidad; // 0 a 100%

    public FocoInteligente(String ubicacion, int intensidad) {
        this.ubicacion = ubicacion;
        this.intensidad = intensidad;
        this.encendido = false;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public void cambiarIntensidad(int nuevaIntensidad) {
        if (nuevaIntensidad >= 0 && nuevaIntensidad <= 100) {
            this.intensidad = nuevaIntensidad;
        }
    }

    public double calcularConsumoWatts() {
        if (!encendido) return 0.0;
        return (intensidad / 100.0) * 12.0; // Consumo máximo 12W
    }

    public void verEstadoActual() {
        System.out.println("Foco [" + ubicacion + "] | Encendido: " + encendido + " | Intensidad: " + intensidad + "% | Consumo: " + calcularConsumoWatts() + "W");
    }

    public boolean isEncendido() { return encendido; }
    public String getUbicacion() { return ubicacion; }
}