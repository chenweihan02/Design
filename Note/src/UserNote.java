import java.util.ArrayList;
import java.util.Date;

/**
 * @author ChenWeihan
 * @create 2021-12-04 16:25
 */

//原发器 用户填的笔记
public class UserNote implements NoteHandle {
    private String noteId; // 笔记id
    private String userId; // 用户id
    private String state; // 私人, 被分享, 被删除, 笔记类型在接口中被定义
    private String title; // 标题
    private String body; // 笔记内容
    private Date createTime; // 创建时间
    private Date lastModifyTime; // 最后修改时间
    private ArrayList tag; // 笔记标签

    private DataFilterAdapter dataFilterAdapter = new DataFilterAdapter();

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public ArrayList getTag() {
        return tag;
    }

    public void setTag(ArrayList tag) {
        this.tag = tag;
    }


    //保存当前版本的笔记。
    @Override
    public Note saveNote() {
        //不是自己的笔记, 不能保存噢~
        if (NoteServer.getInstance().getUser().getUserId() != userId)
        {
            System.out.println("不能保存别人的笔记");
            return null;
        }
        return new Note(noteId, userId, state, title, body, createTime, lastModifyTime, tag);
    }

    // 分享笔记
    @Override
    public void shareNote(Note note) {
        //不是自己的笔记, 不能操作噢~
        if (NoteServer.getInstance().getUser().getUserId() != userId)
        {
            System.out.println("这个笔记不是你的, 不能分享别人的笔记");
            return;
        }
        //过滤敏感词
        dataFilterAdapter.doDataFilter(note.getTitle());
        dataFilterAdapter.doDataFilter(note.getBody());
        note.setState(NoteState.NOTE_TYPE_SHARED);
    }

    @Override
    public void unShareNote(Note note) {
        //不是自己的笔记, 不能操作噢~
        if (NoteServer.getInstance().getUser().getUserId() != userId)
        {
            System.out.println("这个笔记不是你的, 不能取消分享别人的笔记");
            return;
        }
        note.setState(NoteState.NOTE_TYPE_PRIVATE);
    }

    @Override
    public void deleteNote(Note note) {
        //不是自己的笔记, 不能操作噢~
        if (NoteServer.getInstance().getUser().getUserId() != userId)
        {
            System.out.println("这个笔记不是你的, 不能取消分享别人的笔记");
            return;
        }
        note.setState(NoteState.NOTE_TYPE_DELETE);
    }

    @Override
    public void recovery(Note note) {
        //不是自己的笔记, 不能操作噢~
        if (NoteServer.getInstance().getUser().getUserId() != userId)
        {
            System.out.println("这个笔记不是你的, 不能取消分享别人的笔记");
            return;
        }
        note.setState(NoteState.NOTE_TYPE_PRIVATE);
    }

    // 恢复上一个版本的笔记, 其实也是属于编辑笔记，只是编辑成上一个笔记
    @Override
    public void restoreNote(Note note) {
        if (NoteServer.getInstance().getUser().getUserId() != userId)
        {
            System.out.println("不能保存别人的笔记");
            return;
        }
        editNote(note);
    }

    @Override
    public void readNote() {
        System.out.println("用户笔记show");
    }


    @Override
    public void createNote(Note note) {
        editNote(note);
    }

    //在编辑的时候过滤敏感词。
    //编辑笔记。
    @Override
    public void editNote(Note note) {
        if (NoteServer.getInstance().getUser().getUserId() != userId)
        {
            System.out.println("不能编辑别人的笔记");
            return ;
        }
        this.noteId = note.getNoteId();
        this.userId = note.getUserId();
        this.state = note.getState();
        this.title = dataFilterAdapter.doDataFilter(note.getTitle());
        this.body = dataFilterAdapter.doDataFilter(note.getBody());
        this.createTime = note.getCreateTime();
        this.lastModifyTime = note.getLastModifyTime();
        this.tag = note.getTag();
    }

}
