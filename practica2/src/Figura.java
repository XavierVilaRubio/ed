public abstract class Figura {
    public String color;
    public Double area;

    abstract double CalculaArea();
    String GetColor(){
        return color;
    }
    void SetColor(String c){
        color = c;
    }
}

class Cuadrado extends Figura {
    public double costado;

    @Override
    double CalculaArea() {
        return costado*costado;
    }

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
