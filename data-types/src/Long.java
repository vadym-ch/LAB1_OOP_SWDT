public final class Long extends IntegralType {

    private long value;

    public long getValue() {
        return value;
    }
    
    public void setValue(long value) {
        this.value = value;
    }

    @Override
    public String showInfo() {
        return "Integral numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.";
    }

}
