public abstract class Figura {
    public String color;
    public Double area;

    abstract double CalculaArea();
    abstract String GetColor();
    abstract void SetColor(String c);
}

class Cuadrado extends Figura {
    @Override
    double CalculaArea() {
        return costado*costado;
    }

    @Override
    String GetColor() {
        return color;
    }

    @Override
    void SetColor(String c) {
        color = c;
    }

    public double costado;

    public double getCostado(){
        return costado;
    }
    public void setCostado(double c){
        costado = c;
    }
}

class Circumferencia extends Figura{
    public double radio;

    @Override
    String GetColor() {
        return color;
    }

    @Override
    void SetColor(String c) {
        color = c;
    }

    @Override
    double CalculaArea() {
        return 3.1415*radio*radio;
    }

    public double getRadio(){
        return radio;
    }
    public void setRadio(double r){
        radio = r;
    }
}
