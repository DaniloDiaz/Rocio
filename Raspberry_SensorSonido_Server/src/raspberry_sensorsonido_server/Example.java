package raspberry_sensorsonido_server;

import org.iot.raspberry.grovepi.GrovePi;

public interface Example {

  public void run(GrovePi grovePi, Monitor monitor) throws Exception;

}
