public class Volume extends Control implements OnClickListener {
    private int step;

    public Volume() {
        System.out.println("Created volume control!");
    }

    public Volume(int step) {
        this.step = step;
        System.out.println("Created volume control! With step: " + step);
    }

    public int getStep() {
        return step;
    }

    @Override
    public void clickAction(Control sender) {
        for (OnClickListener listener : this.listeners) listener.clickAction(this);
    }
}