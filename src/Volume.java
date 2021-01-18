public class Volume extends Control implements OnClickListener{
    public Volume(){
        System.out.println("Created volume control!");
    }
    public Volume(int step){
        super.step = step;
        System.out.println("Created volume control! With step: " + step);
    }

    @Override
    public void clickAction(Control sender) {
        for (OnClickListener listener: this.listeners) listener.clickAction(this);
    }
}
