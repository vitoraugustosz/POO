package ads.poo;

public class Ponto {

    private double x;
    private double y;

    public Ponto(double x, double y) {//construtor
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y +
                ')';
    }

    public double calcDistancia(Ponto outroPonto){
        return Math.sqrt((Math.pow((outroPonto.x - this.x), 2)+Math.pow((outroPonto.y-this.y),2)));

    }




}
