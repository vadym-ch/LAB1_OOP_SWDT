public final class Double extends FloatingPointType {

    private double value;


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    @Override
    public String showInfo() {
        return "Fractional numbers.";
    }

}
