/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspberry_sensorsonido_app;

import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.management.monitor.Monitor;
import org.iot.raspberry.grovepi.GrovePi;

/**
 *
 * @author Usuario
 */
public interface EncenderLed extends Remote{
    public String/*void*/encenderled() throws RemoteException;
}
