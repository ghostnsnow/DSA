package designpatterns.behavioural.abstractfactory;

public class ApartmentFactory implements HouseFactory {

    @Override
    public Window createWindow(int height, int width) {

        return new ApartmentWindow(height, width);
    }

    @Override
    public Door createDoor(String material, int height, int width) {

        return new ApartmentDoor(material, height, width);
    }
}
