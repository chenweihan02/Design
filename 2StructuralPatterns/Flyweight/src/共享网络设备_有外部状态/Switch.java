package 共享网络设备_有外部状态;
/**
 * @author ChenWeihan
 * @create 2021-12-04 9:47
 */
public class Switch implements NetworkDevice {

    private String type;

    public Switch(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.getType();
    }

    @Override
    public void use(Port port) {
        System.out.println("Linked by Switch, type is " + this.type + " ,port is " + port.getPort());
    }
}
