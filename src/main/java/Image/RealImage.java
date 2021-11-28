package Image;

public class RealImage implements Image{
    String fileName;
    @Override
    public void display() {
        System.out.println("Don`t know what to do here((");
    }

    RealImage(String fileName) {
        this.fileName = fileName;
    }

    public void loadFromDisk() {
        display();
    }
}
