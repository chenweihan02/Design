/**
 * @author ChenWeihan
 * @create 2021-11-28 15:48
 * @describe: 某系统需要提供一个加密模块, 将用户信息(密码等机密信息)加密之后再存储在数据库中
 * 系统已经定义好了数据库操作类。为了提高开发效率, 现需要重用已有的加密算法, 这些算法封装在一些
 * 由第三方提供的类中, 有些甚至没有源代码。使用适配器模式设计该加密模块, 实现在不修改现有类的基础
 * 上重用第三方加密方法。
 *
 */

//数据操作类
public abstract class DataOperation {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract String doEncrypt(int key, String ps);
}
