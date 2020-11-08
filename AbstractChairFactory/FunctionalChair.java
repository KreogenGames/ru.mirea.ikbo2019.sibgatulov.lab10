package AbstractChairFactory;

public class FunctionalChair {

    int x, y;

    public FunctionalChair(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "FunctionalChair{" + "x=" + x + ", y=" + y + '}';
    }
}
