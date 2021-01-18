public class DiscoLights {
    public static void main(String[] args) {
        //определяем устройства

        //динамики
        Speaker sp1, sp2;
        sp1 = new Speaker("right");
        sp2 = new Speaker("left");

        //регуляторы громкости
        Volume rightVolumeControlPlus = new Volume(1);
        Volume rightVolumeControlMinus = new Volume(-1);
        rightVolumeControlPlus.addListener(sp1);
        rightVolumeControlMinus.addListener(sp1);

        Volume leftVolumeControlPlus = new Volume(1);
        Volume leftVolumeControlMinus = new Volume(-1);
        leftVolumeControlPlus.addListener(sp2);
        leftVolumeControlMinus.addListener(sp2);

        Volume masterVolumeControlPlus = new Volume(1);
        Volume masterVolumeControlMinus = new Volume(-1);
        masterVolumeControlPlus.addListener(sp1);
        masterVolumeControlPlus.addListener(sp2);
        masterVolumeControlMinus.addListener(sp1);
        masterVolumeControlMinus.addListener(sp2);

        //управление динамиками
        Button buttonMasterVolumeControlMinus = new Button();
        buttonMasterVolumeControlMinus.addListener(masterVolumeControlMinus);
        Button buttonMasterVolumeControlPlus = new Button();
        buttonMasterVolumeControlPlus.addListener(masterVolumeControlPlus);

        Button buttonRightVolumeControlMinus = new Button();
        buttonRightVolumeControlMinus.addListener(rightVolumeControlMinus);
        Button buttonRightVolumeControlPlus = new Button();
        buttonRightVolumeControlPlus.addListener(rightVolumeControlPlus);

        Button buttonLeftVolumeControlMinus = new Button();
        buttonLeftVolumeControlMinus.addListener(leftVolumeControlMinus);
        Button buttonLeftVolumeControlPlus = new Button();
        buttonLeftVolumeControlPlus.addListener(leftVolumeControlPlus);

        buttonLeftVolumeControlPlus.onClick();
        buttonLeftVolumeControlPlus.onClick();
        buttonLeftVolumeControlPlus.onClick();
        buttonMasterVolumeControlMinus.onClick();
        buttonMasterVolumeControlMinus.onClick();
        buttonMasterVolumeControlMinus.onClick();

        //свето-музыка
        Console visibleConsole;
        visibleConsole = new Console();

        //управление свето-музыкой
        Button buttonChangeColor = new Button();
        buttonChangeColor.addListener(visibleConsole);

        for (int i = 0; i < 10; i++)
            buttonChangeColor.onClick();

    }
}
