/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspberry_sensorsonido_server;

import java.rmi.RemoteException;
import org.iot.raspberry.grovepi.GroveDigitalOut;
import org.iot.raspberry.grovepi.GrovePi;
import raspberry_sensorsonido_app.EncenderLed;

/**
 *
 * @author Usuario
 */
public class ObjEncenderLed implements EncenderLed /*Example*/ {
    String estado="LED ENCENDIDO...";
    @Override
    public String encenderled()throws RemoteException{
        return String.format(estado);
    }
    /*
    @Override
    public void run(GrovePi grovePi, Monitor monitor) throws Exception {
        GroveDigitalOut led = grovePi.getDigitalOut(2);
        boolean state = false;
        while (monitor.isRunning()) {
            state = !state;
            led.set(state);
            //Thread.sleep(500);
        }
        //led.set(false);
    }
*/

}
