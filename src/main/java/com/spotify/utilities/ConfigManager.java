package com.spotify.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
    private static ConfigManager manager;
    private static final Properties proper = new Properties();

   private String getEnv() throws IOException {
       System.out.println(" loading d1");
       InputStream inputStream = ConfigManager.class.getResourceAsStream("/config/env.settings");
       proper.load(inputStream);
       return proper.getProperty("env");
   }

    private ConfigManager(String env) throws IOException {
         String e =getEnv();
        System.out.println(" loading env--> "+e);
        String path = "/config/config.{env}.properties".replace("{env}",e);
        InputStream inputStream = ConfigManager.class.getResourceAsStream(path);
        proper.load(inputStream);
    }

    public static ConfigManager getInstance(String env)  {
        if (manager==null){
            synchronized(ConfigManager.class){
                try{
                    manager=new ConfigManager(env);
                }
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return manager;
    }

    public String getString(String key){
        return System.getProperty(key,proper.getProperty(key));

    }
}
