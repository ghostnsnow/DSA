package designpatterns.behavioural.abstractfactory;

public interface HouseFactory {

    Window createWindow(int height, int width);
    Door createDoor(String material, int height, int width);
}
