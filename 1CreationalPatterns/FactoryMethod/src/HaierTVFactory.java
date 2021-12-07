/**
 * @author ChenWeihan
 * @create 2021-11-28 13:41
 */
public class HaierTVFactory implements TVFactory{
    @Override
    public TV produceTV() {
        System.out.println("海尔电视机工厂生产海尔电视机.");
        return new HaierTV();
    }
}
