package AbstractChairFactory;

public class Test {
    public static void main(String[] args) {

        VictorianChair Victorian = new VictorianChair(230);
        System.out.println(Victorian);

        MagicChair Magician = new MagicChair("flying");
        System.out.println(Magician);

        FunctionalChair Functional = new FunctionalChair(30, 90);
        System.out.println(Functional);
    }
}
