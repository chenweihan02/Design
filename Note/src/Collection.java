import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author ChenWeihan
 * @create 2021-12-04 15:58
 */

// 笔记收藏夹
public class Collection {
    private String collectId;
    private ArrayList noteList;
    private String userId;

    public Collection(String collectId, ArrayList noteList, String userId) {
        this.collectId = collectId;
        this.noteList = noteList;
        this.userId = userId;
    }

    public String getCollectId() {
        return collectId;
    }

    public void setCollectId(String collectId) {
        this.collectId = collectId;
    }

    public ArrayList getNoteList() {
        return noteList;
    }

    public void setNoteList(ArrayList noteList) {
        this.noteList = noteList;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void add(Note note) {
        noteList.add(note);
    }

    public void remove(Note note) {
        noteList.remove(note);
    }
    
}
