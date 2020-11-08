package AbstractChairFactory;

public class MagicChair {

    String ability;

    public MagicChair(String ability){
        this.ability = ability;
    }

    public String getAbility() {
        return ability;
    }

    @Override
    public String toString() {
        return "MagicChair{" + "ability=" + ability +'}';
    }
}
