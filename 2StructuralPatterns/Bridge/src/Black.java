/**
 * @author ChenWeihan
 * @create 2021-12-01 16:47
 */
public class Black implements Color{
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "黑色的" + name + ".");
    }
}
