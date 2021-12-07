package shallowClone;

/**
 * @author ChenWeihan
 * @create 2021-11-28 14:58
 */
public class Email implements Cloneable{
    private Attachment attachment = null;

    public Email() {
        this.attachment = new Attachment();
    }

    @Override
    public Object clone() {
        Email clone = null;
        try {
            clone = (Email) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failure!");
        }
        return clone;
    }

    public Attachment getAttachment() {
        return this.attachment;
    }

    public void display() {
        System.out.println("查看邮件");
    }
}
