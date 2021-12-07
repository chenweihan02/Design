/**
 * @author ChenWeihan
 * @create 2021-11-28 14:25
 */
public class HaierFactory implements EFactory{

    @Override
    public Television produceTelevision() {
        return new HaierTelevision();
    }

    @Override
    public AirConditioner produceAirConditoner() {
        return new HaierAirConditioner();
    }
}
