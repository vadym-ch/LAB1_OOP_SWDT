public abstract class Animals {
    
    protected String name;
    
    protected int weight;

    protected Boolean voice;

    public abstract String introduceMyself();

    public String getName() {
    return name;
    }
    public void setName(String name) {
    this.name = name;
    }
    
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }  

    public Boolean getVoice() {
        return voice;
    }
    public void setVoice(Boolean voice) {
        this.voice = voice;
    }
    
}
