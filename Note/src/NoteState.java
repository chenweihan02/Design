/**
 * @author ChenWeihan
 * @create 2021-12-04 16:07
 */
public interface NoteState {

    // 定义常量, 表示笔记的几种类型
    String NOTE_TYPE_PRIVATE = "1"; // 私人笔记
    String NOTE_TYPE_SHARED = "2"; // 分享公开的笔记
    String NOTE_TYPE_DELETE = "3"; // 被删除的笔记
    String NOTE_TYPE_LAST_VERSION = "4"; // 上一个版本的笔记 // 只保存在数据中就行了
}
