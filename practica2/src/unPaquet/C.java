package unPaquet;

public class C {
    A a;
    public C(){
        a = new A();
    }
    public void metodeC(){
        System.out.println("El valor de a es: " + a.getX());
    }
}
