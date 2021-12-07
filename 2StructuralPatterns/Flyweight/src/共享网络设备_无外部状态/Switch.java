package 共享网络设备_无外部状态;

/**
 * @author ChenWeihan
 * @create 2021-12-04 9:31
 */
public class Switch implements NetworkDevice{

    private String type;

    public Switch(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.getType();
    }

    @Override
    public void use() {
        System.out.println("Linked by Switch, type is " + this.type);
    }
}
