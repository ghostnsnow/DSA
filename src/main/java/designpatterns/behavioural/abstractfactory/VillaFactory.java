package designpatterns.behavioural.abstractfactory;

public class VillaFactory implements HouseFactory {

    @Override
    public Window createWindow(int height, int width) {

        return new VillaWindow(height, width);
    }

    @Override
    public Door createDoor(String material, int height, int width) {

        return new VillaDoor(material, height, width);
    }
}
