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
    public String GetUserName() {

        String username = pro.getProperty("username");
        return username;
    }
    public String GetPassword() {

        String password = pro.getProperty("username");
        return password;
    }

    public String GetWrongUsername() {
        String username_invalid = pro.getProperty("username_invalid");
        return username_invalid;

    }
    public String GetWrongPassword() {

        String password_invalid = pro.getProperty("password_invalid");
        return password_invalid;
    }



}
