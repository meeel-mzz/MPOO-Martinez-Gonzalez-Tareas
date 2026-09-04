public class BocinaInteligente {
    private String nombre;
    private boolean reproduciendo;
    private int volumen;

    public BocinaInteligente(String nombre) {
        this.nombre = nombre;
        this.reproduciendo = false;
        this.volumen = 20;
    }

    public void reproducirMusica() {
        this.reproduciendo = true;
    }

    public void pausarMusica() {
        this.reproduciendo = false;
    }

    public void ajustarVolumen(int vol) {
        if (vol >= 0 && vol <= 100) {
            this.volumen = vol;
        }
    }

    public int calcularDecibelesEstimados() {
        if (!reproduciendo) return 0;
        return 30 + (volumen / 2);
    }

    public void verEstadoActual() {
        System.out.println("Bocina [" + nombre + "] | Reproduciendo: " + reproduciendo + " | Volumen: " + volumen + " | dB aprox: " + calcularDecibelesEstimados());
    }

    public boolean isReproduciendo() { return reproduciendo; }
}