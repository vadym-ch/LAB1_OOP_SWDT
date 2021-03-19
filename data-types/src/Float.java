public final class Float extends FloatingPointType {

    private float value;

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String showInfo() {
        return "Fractional numbers.";
    }

}
