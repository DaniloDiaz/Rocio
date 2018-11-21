/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspberry_sensorsonido_cliente;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import raspberry_sensorsonido_app.EncenderLed;
import raspberry_sensorsonido_app.ObtenerSonido;

/**
 *
 * @author Usuario
 */
public class Main_Cliente {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        //----------------------------------------------------
        //Variables para enviar correo
        //Notificar n = new Notificar();
        String to = "mddiaz2511@gmail.com";
        String sub = "Prueba Sensor Sonido Raspberry";
        String msg = "Se notifica por medio del presente correo que el nivel de ruido es alto";
        //n.enviarEmail(to, sub, msg);
        //-----------------------------------------------------
        
        //Variables para notificar
        String host = "localhost";
        String name = "El servidor";
        
        // Especificación del nombre del host donde se ejecuta el registro
        // y el puerto.
        Registry registry = LocateRegistry.getRegistry(host, Registry.REGISTRY_PORT);
        
        
        //ObtenerSonido obtenersonido = (ObtenerSonido) registry.lookup("");
        //System.out.println(name + " indica que " + encenderled.encenderled());
        
        Scanner tc = new Scanner(System.in);//Declaracion de variable tc tipo Scanner
        System.out.println("_________________________________");
        System.out.println("|                                |");
        System.out.println("|     Interactuar RaspBerry      |");
        System.out.println("|                                |");
        System.out.println("|          Elija Opcion          |");
        System.out.println("|          (1 - 2 - 3)           |");
        System.out.println("|                                |");
        System.out.println("|   [1] Encender Led             |");
        System.out.println("|   [2] Apagar Led               |");
        System.out.println("|   [3] Consultar Sonido         |");
        System.out.println("|                                |");
        System.out.println("|________________________________|");
        System.out.println("");
        int num = Integer.parseInt(tc.nextLine());//hacer lectura de la linea q se escriba
        switch (num){
            case 1:
                EncenderLed encenderled = (EncenderLed)registry.lookup("");
                System.out.println(name + " reporta que " + encenderled.encenderled());
                break;
            
            case 2:
                
                break;
            case 3:
                
                break;
              
        }
        
        //System.out.println(name + " reporta que el nivel de ruido es " + obtenersonido.obtenersonido());
    
       
    }
    
}
