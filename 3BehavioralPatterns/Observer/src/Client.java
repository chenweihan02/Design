/**
 * @author ChenWeihan
 * @create 2021-12-03 21:00
 */
public class Client {
    public static void main(String[] args) {
        MySubject subject = new Cat();

        MyObserver obs1 = new Mouse();
        MyObserver obs2 = new Mouse();
        MyObserver obs3 = new Dog();

        subject.attach(obs1);
        subject.attach(obs2);
        subject.attach(obs3);

        subject.cry();
    }
}
