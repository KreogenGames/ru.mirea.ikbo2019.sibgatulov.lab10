package ComplexAbstractFactory;

public class Test {
    public static void main(String[] args) {
        Complex a = new Complex(3, 141);
        System.out.println(a);

        ComplexAbstractFactory b = new ConcreteFactory();
        Complex b1 = b.createComplex(2, 718);
        System.out.println(b1);
    }
}
