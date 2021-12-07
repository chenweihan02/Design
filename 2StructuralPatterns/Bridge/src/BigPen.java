/**
 * @author ChenWeihan
 * @create 2021-12-01 16:49
 */
public class BigPen extends Pen{
    @Override
    public void draw(String name) {
        String penType = "大号毛笔绘制";
        this.color.bepaint(penType, name);
    }
}
