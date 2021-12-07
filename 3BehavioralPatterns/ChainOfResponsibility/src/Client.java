/**
 * @author ChenWeihan
 * @create 2021-12-04 10:11
 */
public class Client {
    public static void main(String[] args) {
        Leader director, manager, generalManager;
        director = new Director("小张");
        manager = new Manager("赵子龙");
        generalManager = new GeneralManager("刘备");

        director.setSuccessor(manager);
        manager.setSuccessor(generalManager);

        LeaveRequest lr1 = new LeaveRequest("张三", 2);
        director.handleRequest(lr1);
        LeaveRequest lr2 = new LeaveRequest("李四", 5);
        director.handleRequest(lr2);
        LeaveRequest lr3 = new LeaveRequest("王五", 15);
        director.handleRequest(lr3);
        LeaveRequest lr4 = new LeaveRequest("刘某", 45);
        director.handleRequest(lr4);
    }
}
