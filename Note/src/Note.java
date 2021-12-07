import java.util.ArrayList;
import java.util.Date;

/**
 * @author ChenWeihan
 * @create 2021-12-04 15:23
 */
class Note {
    private String noteId; // 笔记id
    private String userId; // 用户id
    private String state; // 私人, 被分享, 被删除, 笔记类型在接口中被定义
    private String title; // 标题
    private String body; // 笔记内容
    private Date createTime; // 创建时间
    private Date lastModifyTime; // 最后修改时间
    private ArrayList tag; // 笔记标签

    public Note(String noteId, String userId, String state, String title, String body, Date createTime, Date lastModifyTime, ArrayList tag) {
        this.noteId = noteId;
        this.userId = userId;
        this.state = state;
        this.title = title;
        this.body = body;
        this.createTime = createTime;
        this.lastModifyTime = lastModifyTime;
        this.tag = tag;
    }

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
}
