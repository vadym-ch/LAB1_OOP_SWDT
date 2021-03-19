public final class Int extends IntegralType {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String showInfo() {
        return "Integral numbers from -2,147,483,648 to 2,147,483,647.";
    }

}
