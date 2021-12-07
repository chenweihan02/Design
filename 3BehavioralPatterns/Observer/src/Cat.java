/**
 * @author ChenWeihan
 * @create 2021-12-03 20:58
 */
public class Cat extends MySubject{
    @Override
    public void cry() {
        System.out.println("猫叫!");
        System.out.println("----------------------");

        for (Object obs : observers) {
            ((MyObserver)obs).response();
        }
    }
}
