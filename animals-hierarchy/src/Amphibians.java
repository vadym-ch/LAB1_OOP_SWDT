public final class Amphibians extends ColdBlooded {
    
    private short value;

    public void setValue(short value) {
        this.value = value;
    }

    public short getValue() {
        return value;
    }

    @Override
    public String introduceMyself() {
        return " I belong to the kingdom of Amphibians";
    } 

}
