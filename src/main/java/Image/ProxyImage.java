package Image;

public class ProxyImage implements Image{
    RealImage realImage;
    String fileName;


    ProxyImage(String fileName) {
        this.fileName = fileName;
        this.realImage = new RealImage(fileName);
    }

    @Override
    public void display() {
        realImage.display();
    }
}
