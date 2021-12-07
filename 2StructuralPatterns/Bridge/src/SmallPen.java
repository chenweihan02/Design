/**
 * @author ChenWeihan
 * @create 2021-12-01 16:51
 */
public class SmallPen extends Pen{
    @Override
    public void draw(String name) {
        String penType = "小号毛笔绘制";
        this.color.bepaint(penType, name);
    }
}
