public final class Boolean extends PrimitiveType {

    private boolean value;

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
    this.value = value;
    }

    @Override
    public String showInfo() {
        return "True or false";
    }

}
