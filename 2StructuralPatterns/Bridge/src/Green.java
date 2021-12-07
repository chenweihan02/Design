/**
 * @author ChenWeihan
 * @create 2021-12-01 16:46
 */
public class Green implements Color{
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "绿色的" + name + ".");
    }
}
