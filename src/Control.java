import java.util.ArrayList;
import java.util.List;

public abstract class Control {
    protected List<OnClickListener> listeners = new ArrayList<>();

    public void onClick() {
        // TODO Auto-generated method stub
        for (OnClickListener onClickListener : listeners) {
            onClickListener.clickAction(this);
        }
    }

    public void addListener(OnClickListener listener) {
//        listeners.add(listener);

    }

    public void removeListener(OnClickListener listener) {
        // TODO Auto-generated method stub
        listeners.remove(listener);
    }
}
