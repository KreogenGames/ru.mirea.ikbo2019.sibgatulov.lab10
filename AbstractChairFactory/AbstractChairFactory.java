package AbstractChairFactory;

public interface AbstractChairFactory {

    VictorianChair createVictorianChair();

    MagicChair createMagicChair();

    FunctionalChair createFunctionalChair();
}
