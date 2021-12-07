package 共享网络设备_无外部状态;

/**
 * @author ChenWeihan
 * @create 2021-12-04 9:40
 */
public class Client {
    public static void main(String[] args) {
        NetworkDevice nd1, nd2, nd3;
        DeviceFactory deviceFactory = new DeviceFactory();

        nd1 = deviceFactory.getNetworkDevice("cisco");
        nd1.use();

        nd2 = deviceFactory.getNetworkDevice("cisco");
        nd2.use();

        nd3 = deviceFactory.getNetworkDevice("tp");
        nd3.use();

        System.out.println("Total Device: " + deviceFactory.getTotalDevice());
        System.out.println("Total Terminal: " + deviceFactory.getTotalTerminal());
    }
}
