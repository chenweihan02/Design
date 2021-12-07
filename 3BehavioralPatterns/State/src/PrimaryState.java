/**
 * @author ChenWeihan
 * @create 2021-12-03 21:08
 */
public class PrimaryState extends AbstractState{

    public PrimaryState(AbstractState state) {
        this.acc = state.acc;
        this.point = state.getPoint();
        this.stateName = "新手";
    }

    public PrimaryState(ForumAccount acc) {
        this.point = 0;
        this.acc = acc;
        this.stateName ="新手";
    }

    @Override
    public void downloadFile(int score) {
        System.out.println("对不起, " + acc.getName() + " , 您没有下载文件的权限!");
    }

    @Override
    public void checkState(int score) {
        if (point >= 1000) {
            acc.setState(new HighState(this));
        }
        else if (point >= 100) {
            acc.setState(new MiddleState(this));
        }
    }
}