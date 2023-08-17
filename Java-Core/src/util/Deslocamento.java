package util;
/**
 * classe em Java que contém métodos, construtores e
 * métodos set e get que calculam o tempo necessário para o deslocamento entre um ponto A e B:
 * 
 * */
public class Deslocamento {
	private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double velocidade;

    public Deslocamento() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
        this.velocidade = 0;
    }

    public Deslocamento(double x1, double y1, double x2, double y2, double velocidade) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.velocidade = velocidade;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double calcularDistancia() {
        double distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return distancia;
    }

    public double calcularTempo() {
        double tempo = calcularDistancia() / velocidade;
        return tempo;
    }
/*
 * Para usar esta classe, você pode criar um objeto Deslocamento e definir os valores dos atributos x1, y1, x2 e y2.
 * Em seguida, você pode chamar o método calcularDistancia() para obter a distância entre os dois pontos e
 *  o método calcularTempo() para obter o tempo necessário para o deslocamento.
 * **/
}
