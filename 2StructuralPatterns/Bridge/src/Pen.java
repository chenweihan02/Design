/**
 * @author ChenWeihan
 * @create 2021-12-01 16:48
 */
public abstract class Pen {
    protected Color color;
    public void setColor(Color color) {
        this.color = color;
    }
    public abstract void draw(String name);
}
