/**
 * @author ChenWeihan
 * @create 2021-11-28 13:42
 */
public class HisenseTVFactory implements TVFactory{
    @Override
    public TV produceTV() {
        System.out.println("海信电视机生产海信电视机.");
        return new HisenseTV();
    }
}
