package Ejercicio2;

public class EstadoPartida {

    /*
    2. En el contexto del desarrollo de un videojuego, se ha creado una clase llamada
EstadoPartida para persistir el estado actual de una partida, de manera que se pueda
implementar la funcionalidad de Guardar / Recuperar la partida. De manera
conceptual, la clase EstadoPartida tan solo dispone de dos atributos numéricos:
vidasRestantes y pantallaActual. Se pide al desarrollador que implemente la clase
EstadoPartida y estos dos métodos de la aplicación:
-void guardarPartida(EstadoPartida objEstadoPartida)
-EstadoPartida recuperarPartida()
     */
    private int vidaRestante;
    private int pantallaActual;

    public EstadoPartida(int vidaRestante, int pantallaActual) {
        this.vidaRestante = vidaRestante;
        this.pantallaActual = pantallaActual;
    }

    public int getVidaRestante() {
        return vidaRestante;
    }

    public void setVidaRestante(int vidaRestante) {
        this.vidaRestante = vidaRestante;
    }

    public int getPantallaActual() {
        return pantallaActual;
    }

    public void setPantallaActual(int pantallaActual) {
        this.pantallaActual = pantallaActual;
    }

    @Override
    public String toString() {
        return "EstadoPartida{" +
                "vidaRestante=" + vidaRestante +
                ", pantallaActual=" + pantallaActual +
                '}';
    }
}
