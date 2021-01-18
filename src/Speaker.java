public class Speaker implements OnClickListener {
    Integer volume = 0;
    private String name;
    public Speaker( String name){
        this.name = name;
    }
    @Override
    public void clickAction(Object sender) {
        // TODO Auto-generated method stub
        System.out.println(sender.getClass().getName() + " " + name + "  Volume: " + (++volume).toString());
    }

    public void mute(){
        volume=0;
    }
    
}
