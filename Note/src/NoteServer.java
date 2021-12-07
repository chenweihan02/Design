import 加密.AdvancedEncryptMD5;
import 加密.SimpleEncryptMD5;

/**
 * @author ChenWeihan
 * @create 2021-12-04 16:13
 */

//服务端。
public class NoteServer implements UserHandle{
    private static final NoteServer noteServer = new NoteServer();
    private User user = new User("vistor","vistor","","游客");
    private AdvancedEncryptMD5 realizeEncrypt = new AdvancedEncryptMD5(new SimpleEncryptMD5());

    public User getUser() {
        return user;
    }

    private UserNote userNote = new UserNote();

    private NoteServer() {}

    public static NoteServer getInstance() {
        return  noteServer;
    }

    @Override
    public void login(User user) {
        // 比较md5
        realizeEncrypt.encrypt(user.getPassword());
        //登陆成功的话
        this.user = user;
    }

    @Override
    public void register(User user) {
        // 比较md5
        realizeEncrypt.encrypt(user.getPassword());
        //注册
    }

    //写到数据库中.
    public void saveNote() {
        //如果数据库中已经存在NOTE_TYPE_PRIVATE，就将数据库中的改为上一个版本.
        Note note = userNote.saveNote();
        note.setState(NoteState.NOTE_TYPE_PRIVATE);
    }

    //从数据库中获取.
    public void getNote() {
        //获取上一个版本。 如果没有的话，再获取最新版本.
        userNote.getState().equals(NoteState.NOTE_TYPE_LAST_VERSION);
    }

}
