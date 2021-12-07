package 共享网络设备_有外部状态;

/**
 * @author ChenWeihan
 * @create 2021-12-04 9:48
 */
public class Hub implements NetworkDevice {
    private String type;
    public Hub(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use(Port port) {
        System.out.println("Linked by Hub, type is " + this.type + " ,port is " + port.getPort());
    }
}
