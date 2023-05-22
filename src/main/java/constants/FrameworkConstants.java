package constants;


import org.apache.logging.log4j.Level;

import java.time.Duration;

//final -> We do not want any class to extend this class
public final class FrameworkConstants {

    //private -> We do not want anyone to create the object of this class
    private FrameworkConstants() {
    }
    public static final Level NOTICE = Level.forName("NOTICE", 450);


}

