public final class Byte extends IntegralType {

    private byte value;

    public byte getValue() {
        return value;
    }
    public void setValue(byte value) {
        this.value = value;
    }

    @Override
    public String showInfo() {
        return "Integral numbers from -128 to 127.";
    }

}
