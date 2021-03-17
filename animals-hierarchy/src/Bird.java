public final class Bird extends WarmBlooded{
    private byte value;

    public void setValue(byte value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String introduceMyself() {
        return " I belong to the kingdom of birds.";
    }
    
}
