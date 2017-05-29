package org.whs542.subsys.flywheel;

import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Amar2 on 5/29/2017.
 */

public interface Flywheel {

    public void runFlywheelNoToggle(double power);

    public void runFlywheelWithToggle(boolean gamepadInput);


}
