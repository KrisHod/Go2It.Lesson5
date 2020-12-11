package Task5_1;

public class ShoesMain {
    public static void main(String[] args) {
        Shoes sneakers = new Sneakers(6,"polyester", true);
        HeeledShoes heeledShoes = new HeeledShoes(9, "leather", 5);

        System.out.println(sneakers);
        System.out.println(heeledShoes);
    }
}
