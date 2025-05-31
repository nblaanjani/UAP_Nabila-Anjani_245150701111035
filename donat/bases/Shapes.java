package donat.bases;

public abstract class Shape {
    protected String name;

    public Shape() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void printInfo();
}
