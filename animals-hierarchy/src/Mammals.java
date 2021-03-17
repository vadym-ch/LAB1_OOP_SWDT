public final class Mammals extends WarmBlooded {
    
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String introduceMyself() {
        return " I belong to the kingdom of mammals.";
    }
}
