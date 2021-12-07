import java.util.Date;

/**
 * @author ChenWeihan
 * @create 2021-12-05 15:10
 */
public class AAAAAAAAAAA {
    public static void main(String[] args) {
        User user = new User("1", "1", "1", "1", "2");

        Car car = new Car("1", "BMW", "1", "good", 20);

        Order order = new Order("1", "1", "1", new Date(), "1", 1000, "1", "1", "1", new Date());

        Order order1 = new Order("1", "1", "1", new Date(), "1", 1000, "1", "1", "1", new Date());

        user.completeRentCar(order);
        user.completeRentCar(order1);

    }
}
