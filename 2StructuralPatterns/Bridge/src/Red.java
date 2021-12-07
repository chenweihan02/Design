/**
 * @author ChenWeihan
 * @create 2021-12-01 16:45
 */
public class Red implements Color{
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "红色的" + name + ".");
    }
}
