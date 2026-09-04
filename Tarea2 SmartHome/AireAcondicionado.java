public class AireAcondicionado {
    private String marca;
    private boolean encendido;
    private int temperatura; // Grados Celsius

    public AireAcondicionado(String marca, int temperaturaInicial) {
        this.marca = marca;
        this.temperatura = temperaturaInicial;
        this.encendido = false;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public void ajustarTemperatura(int temp) {
        if (temp >= 16 && temp <= 30) {
            this.temperatura = temp;
        }
    }

    public double estimarCostoPorHora(double costoKwh) {
        if (!encendido) return 0.0;
        double potenciaKw = (31 - temperatura) * 0.1;
        return potenciaKw * costoKwh;
    }

    public void verEstadoActual() {
        System.out.println("Aire Acondicionado [" + marca + "] | Encendido: " + encendido + " | Temp: " + temperatura + "°C");
    }

    public boolean isEncendido() { return encendido; }
}
