import java.security.Policy;

/**
 * @author ChenWeihan
 * @create 2021-12-01 18:07
 */

//安全组合
public class Client {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Pear pear = new Pear();

        Plate plate = new Plate();
        plate.add(apple);
        plate.add(banana);
        plate.add(pear);

        plate.eat();
    }
}
