package 共享网络设备_无外部状态;

/**
 * @author ChenWeihan
 * @create 2021-12-04 9:32
 */
public class Hub implements NetworkDevice{
    private String type;
    public Hub(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use() {
        System.out.println("Linked by Hub, type is " + this.type);
    }
}
