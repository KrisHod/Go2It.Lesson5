package Task5_1;

public class HeeledShoes extends Shoes{
    private int lengthOfHeel;
    private String materialOfHeel;

    public HeeledShoes(){}

    public HeeledShoes(int size, String material, int lengthOfHeel) {
        super(size, material);
        this.lengthOfHeel = lengthOfHeel;
    }

    public int getLengthOfHeel() {
        return lengthOfHeel;
    }

    public void setLengthOfHeel(int lengthOfHeel) {
        this.lengthOfHeel = lengthOfHeel;
    }

    public String getMaterialOfHeel() {
        return materialOfHeel;
    }

    public void setMaterialOfHeel(String materialOfHeel) {
        this.materialOfHeel = materialOfHeel;
    }

    @Override
    public String toString() {
        return "HeeledShoes: " +
                "size=" + getSize() +
                ", material='" + getMaterial() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", lengthOfHeel=" + lengthOfHeel +
                ", materialOfHeel='" + materialOfHeel + '\'';
    }
}
