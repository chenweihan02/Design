/**
 * @author ChenWeihan
 * @create 2021-11-28 14:25
 */
public class TCLFactory implements EFactory{
    @Override
    public Television produceTelevision() {
        return new TCLTelevision();
    }

    @Override
    public AirConditioner produceAirConditoner() {
        return new TCLAirConditioner();
    }
}
