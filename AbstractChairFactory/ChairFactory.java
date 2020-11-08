package AbstractChairFactory;

public class ChairFactory implements AbstractChairFactory {

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(149);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair("unbreakable");
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair(40, 120);
    }
}
