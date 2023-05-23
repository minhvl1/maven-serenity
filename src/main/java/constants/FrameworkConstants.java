package constants;


import org.apache.logging.log4j.Level;
import utils.PropertiesHelpers;

import java.time.Duration;

//final -> We do not want any class to extend this class
public final class FrameworkConstants {

    //private -> We do not want anyone to create the object of this class
    private FrameworkConstants() {
    }
    public static final Level NOTICE = Level.forName("NOTICE", 450);
    public static final String ENVIRONMENT = PropertiesHelpers.getEnvironment("env");
    public static final String DATAACCESS_BASE_URL = PropertiesHelpers.getEnvironment("dataaccess_base_url");
    public static final String DATAACCESS_WEBSERVICESSERVER_PATH_URL = PropertiesHelpers.getEnvironment("dataaccess_webservicesserver_path_url");
    public static final String TEST_XML_PATH = PropertiesHelpers.getEnvironment("test_xml_path");
    public static final String TEST1_XML_PATH = PropertiesHelpers.getEnvironment("test1_xml_path");



}

