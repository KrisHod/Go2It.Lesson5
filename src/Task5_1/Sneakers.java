package Task5_1;

public class Sneakers extends Shoes {
    private boolean isForRunning;

    public Sneakers() {

    }

    public Sneakers(int size, String material, boolean isForRunning) {
        super(size, material);
        this.isForRunning = isForRunning;

    }

    public boolean isForRunning() {
        return isForRunning;
    }

    public void setForRunning(boolean forRunning) {
        isForRunning = forRunning;
    }

    @Override
    public String toString() {
        return "Sneakers: " +
                "size=" + getSize() +
                ", material='" + getMaterial() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", isForRunning=" + isForRunning;
    }
}
