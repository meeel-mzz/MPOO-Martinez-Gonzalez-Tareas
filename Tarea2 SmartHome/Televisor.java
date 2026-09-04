public class Televisor {
    private String marca;
    private boolean encendido;
    private int volumen;

    public Televisor(String marca) {
        this.marca = marca;
        this.encendido = false;
        this.volumen = 15;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public void cambiarVolumen(int nuevoVolumen) {
        if (nuevoVolumen >= 0 && nuevoVolumen <= 100) {
            this.volumen = nuevoVolumen;
        }
    }

    public double calcularHorasUsoEstimadas(double nivelBateriaExterna) {
        if (!encendido) return 0.0;
        return nivelBateriaExterna / 50.0;
    }

    public void verEstadoActual() {
        System.out.println("Televisor [" + marca + "] | Encendido: " + encendido + " | Volumen: " + volumen);
    }

    public boolean isEncendido() { return encendido; }
}