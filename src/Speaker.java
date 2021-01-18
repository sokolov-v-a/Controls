public class Speaker implements OnClickListener {
    Integer volume = 0;
    private String name;
    public Speaker( String name){
        this.name = name;
    }
    @Override
    public void clickAction(Control sender) {
        // TODO Auto-generated method stub
        volume = volume + sender.step;
        volume = (volume<0)?0:volume;
        System.out.println(sender.getClass().getName() + " " + name + "  Volume: " + (volume).toString());
    }

    public void mute(){
        volume=0;
    }
    
}
