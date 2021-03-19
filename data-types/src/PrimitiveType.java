public abstract class PrimitiveType{
    
    protected String name;
    
    protected int size;

    public abstract String showInfo();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}