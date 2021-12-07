package transform;

/**
 * @author ChenWeihan
 * @create 2021-12-01 18:14
 */
public class Client {
    public static void main(String[] args) {
        Transform camaro;
        camaro = new Car();

        camaro.move();
        System.out.println("=========================");
        Robot robot = new Robot(camaro);
        robot.move();
        robot.say();
        System.out.println("=========================");
        Airplane airplane = new Airplane(camaro);
        airplane.fly();
    }
}
