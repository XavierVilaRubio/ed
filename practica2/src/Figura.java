public abstract class Figura {
    public String color;
    public Double area;

    abstract double CalculaArea();
    public String GetColor(){
        return color;
    }
    void SetColor(String c){
       color = c;
    }
}

class Cuadrado extends Figura {
    @Override
    double CalculaArea() {
        return costado*costado;
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
    @Override
    double CalculaArea() {
        return 3.1415*radio*radio;
    }

    public double radio;

    public double getRadio(){
        return radio;
    }
    public void setRadio(double r){
        radio = r;
    }
}
