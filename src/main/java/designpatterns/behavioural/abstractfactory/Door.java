package designpatterns.behavioural.abstractfactory;

public class Door {

    private String material;
    private int height;
    private int width;

    public Door(String material, int height, int width) {
        this.material = material;
        this.height = height;
        this.width = width;
    }
}
