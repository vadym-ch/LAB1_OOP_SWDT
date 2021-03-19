public final class Short extends IntegralType {

    private short value;

    public short getValue() {
        return value;
    }

    public void setValue(short value) {
        this.value = value;
    }

    @Override
    public String showInfo() {
        return "integral numbers from -32,768 to 32,767.";
    }

}
