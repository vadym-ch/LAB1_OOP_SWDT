public final class Char extends PrimitiveType {

    private char value;

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    @Override
    public String showInfo() {
        return "Single UTF-16 encoded character,range of stored values from 0 to 65535.";
    }

}
