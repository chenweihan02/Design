/**
 * @author ChenWeihan
 * @create 2021-12-04 10:45
 */
public class Client {
    public static void main(String[] args) {
        Product b1 = new Book();
        Product b2 = new Book();
        Product a1 = new Apple();

        BuyBasket basket = new BuyBasket();
        basket.addProduct(b1);
        basket.addProduct(b2);
        basket.addProduct(a1);

        Visitor visitor = (Visitor) XMLUtil.getBean();

        visitor.setName("张三");
        basket.accept(visitor);
    }
}
