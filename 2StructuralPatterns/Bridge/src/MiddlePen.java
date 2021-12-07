/**
 * @author ChenWeihan
 * @create 2021-12-01 16:50
 */
public class MiddlePen extends Pen{
    @Override
    public void draw(String name) {
        String  penType = "中号毛笔绘制";
        this.color.bepaint(penType, name);
    }
}
