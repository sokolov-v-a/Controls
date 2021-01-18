public class Console implements OnClickListener {

    private Colors curentColor;

    Console() {
        curentColor = Colors.YELLOW;
    }

    @Override
    public void clickAction(Control sender) {
        // TODO Auto-generated method stub
        if (curentColor == Colors.VIOLET) {
            curentColor = Colors.YELLOW;
        } else {
            boolean lastStep = false;
            for (Colors color : Colors.values()) {
                if (lastStep) {
                    curentColor = color;
                    break;
                }
                if (color == curentColor) {
                    lastStep = true;
                }
            }
        }
        System.out.println(sender.getClass().getName() + ": pushed, color changed! Curent color: " + curentColor);
    }
}
