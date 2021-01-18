public class Console1 implements OnClickListener {

    @Override
    public void clickAction(Object sender) {
        // TODO Auto-generated method stub
        System.out.println( sender.getClass().getName() + ": pushed, color changed!");
    }
    
}
