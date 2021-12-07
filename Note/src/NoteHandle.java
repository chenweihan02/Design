/**
 * @author ChenWeihan
 * @create 2021-12-04 16:21
 */
public interface NoteHandle {
    //创建笔记
    void createNote(Note note);
    // 编辑笔记
    void editNote(Note note);
    // 恢复上一个版本的笔记
    void restoreNote(Note note);
    // 查看笔记
    void readNote();
    // 保存笔记
    Note saveNote();
    // 分享笔记
    void shareNote(Note note);
    // 取消分享
    void unShareNote(Note note);
    // 删除笔记
    void deleteNote(Note note);
    // 恢复
    void recovery(Note note);
}
