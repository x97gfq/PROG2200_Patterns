package Singleton.Example2;

import org.ini4j.Ini;
import java.io.File;
import java.io.IOException;

public class ConfigurationSettings {

    private static Ini ini;
    private static ConfigurationSettings instance;

    public ConfigurationSettings()
    {
        File fileToParse = new File("C:\\Repos\\PROG2200_Patterns\\src\\Singleton\\Example2\\sample.ini");
        try {
            ini = new Ini(fileToParse);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ConfigurationSettings getInstance() {
        if (instance == null) {
            instance = new ConfigurationSettings();
        }
        return instance;
    }

    public static String getFontWeight() {
        String val = ini.get("fonts", "letter");
        return val;
    }

    public static int getFontSize() {
        String val = ini.get("fonts", "text-size");
        return Integer.valueOf(val);
    }
}
