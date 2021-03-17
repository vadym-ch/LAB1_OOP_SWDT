public final class Reptiles extends ColdBlooded {
    
    private long value;

    public void setValue(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    @Override
    public String introduceMyself() {
        return " I belong to the kingdom of Reptiles.";
    } 
    
}
