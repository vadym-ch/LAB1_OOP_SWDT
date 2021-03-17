public class Fish extends ColdBlooded {
    
    private float value;

    public void setValue(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    @Override
    public String introduceMyself() {
        return " I belong to the kingdom of Fishes.";
    } 


}
