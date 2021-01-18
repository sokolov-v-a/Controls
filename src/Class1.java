public class Class1{
    public static void main( String args[] ){
        System.out.println("Hello, World!");

        Button button1, button2;
        Volume rightVolumeControl, leftVolumeControl, masterVolumeControl;

        Console1 visibleConsole;
        Speaker sp1, sp2;

        button1 = new Button();
        button2 = new Button();

        rightVolumeControl = new Volume();
        leftVolumeControl = new Volume();
        masterVolumeControl = new Volume();
        visibleConsole = new Console1();

        sp1 = new Speaker("right");
        sp2 = new Speaker("left");

        
        
//        button1.addListener(visibleConsole);
//        button2.addListener(visibleConsole);
//
//        rightVolumeControl.addListener(sp1);
//        leftVolumeControl.addListener(sp2);
//        masterVolumeControl.addListener(sp1);
//        masterVolumeControl.addListener(sp2);
//
//        button1.onClick();
//        rightVolumeControl.onClick();
//        rightVolumeControl.onClick();
//        rightVolumeControl.onClick();
//        rightVolumeControl.onClick();
//        leftVolumeControl.onClick();
//
//        masterVolumeControl.onClick();
//        masterVolumeControl.removeListener(sp1);
//        masterVolumeControl.onClick();
//        masterVolumeControl.onClick();
//        masterVolumeControl.onClick();
    }
}
