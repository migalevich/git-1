package homework3;

import java.awt.*;

public interface ShipFunctionalityInterface {

    /* This method will be provide functionality for ship fights
    * return */

    int TEST_INTERFACE_VALUE = 10;


    String fight();
    String move();

    default String commentFunctionality(){
        return "";
    }

}
