package Task5_1;

public class Shoes {
    private int size;
    private String material;
    private String brand;

    public Shoes(){
    }

    public Shoes(int size, String material) {
        this.size = size;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Shoes {" +
                "size=" + size +
                ", material='" + material + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
