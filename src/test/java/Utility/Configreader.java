package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader {

     Properties pro;
    public  Configreader() throws IOException {

         pro = new Properties();
        File file = new File("./Config/config.properties");
        FileInputStream fis = new FileInputStream(file);
        pro.load(fis);


    }

    public String GetApplicationURL() {

        String URL = pro.getProperty("URL");
        return URL;

    }
    public String GetChromePath() {

        String chromepath = pro.getProperty("chromepath");
        return chromepath;
    }



}
