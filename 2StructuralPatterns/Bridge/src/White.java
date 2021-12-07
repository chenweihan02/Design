/**
 * @author ChenWeihan
 * @create 2021-12-01 16:47
 */
public class White implements Color{
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "白色的" + name + ".");
    }
}
