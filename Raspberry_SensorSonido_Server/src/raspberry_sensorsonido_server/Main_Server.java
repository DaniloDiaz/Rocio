/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspberry_sensorsonido_server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import java.rmi.server.UnicastRemoteObject;

import raspberry_sensorsonido_app.EncenderLed;
//import raspberry_sensorsonido_app.ObtenerSonido;

        

/**
 *
 * @author Usuario
 */
public class Main_Server{

    public static void main(String[] args) throws RemoteException {
        //String nombre = "abc";
        // registro en la maquina
        Registry registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        
        //implementacion del objeto servidor
        EncenderLed encenderled = new ObjEncenderLed();
        //ObtenerSonido obtenersonido = new CodObtenerSonido();
        
        //stub para el objeto servidor en timpo de ejecucion de RMI
        //implementa comunicacion requerida con el objeto servidor remoto
        //cliente usa este stub  para invocar de forma transparente el metodo del obejeto servidor
        EncenderLed stub = (EncenderLed) UnicastRemoteObject.exportObject(encenderled, 0);

        
        //vincular nombre al stub  --> ???
        registry.rebind("", stub);
        //registry.rebind("", stubb);
        
        System.out.println("servidor en ejecucion....");
    

    }
    
}
