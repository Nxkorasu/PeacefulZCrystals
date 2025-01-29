package dev.nxkorasu.zcrystals.config;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import dev.nxkorasu.zcrystals.ZCrystals;
import dev.nxkorasu.zcrystals.manager.CobbleTransformationsConfigDataManager;
import dev.nxkorasu.zcrystals.util.Adapters;
import java.io.*;

public class CobbleTransformationsConfig {

    public CobbleTransformationsConfigDataManager cobbleTransformationsConfigDataManager;

    public CobbleTransformationsConfig(){
        this.cobbleTransformationsConfigDataManager = new CobbleTransformationsConfigDataManager();
    }

    public static void writeConfig(){
        File dir = ZCrystals.INSTANCE.getConfigDir();
        Gson gson = Adapters.MAIN_CONFIG_GSON;
        CobbleTransformationsConfig config = new CobbleTransformationsConfig();
        try{
            File file = new File(dir,"competitivebattles.json");
            if(file.exists()){
                return;
            }
            FileWriter writer = new FileWriter(file);
            String json = gson.toJson(config);
            writer.write(json);
            writer.close();
        }
        catch (IOException e){
            ZCrystals.INSTANCE.getLog().warn(e);
        }
    }

    public static CobbleTransformationsConfig getConfig(){
        File dir = ZCrystals.INSTANCE.getConfigDir();
        Gson gson = Adapters.MAIN_CONFIG_GSON;
        File file = new File(dir, "competitivebattles.json");
        JsonReader reader = null;
        try{
            reader = new JsonReader(new FileReader(file));
        }
        catch (FileNotFoundException e){
            ZCrystals.INSTANCE.getLog().error(e);
            return null;
        }

        return gson.fromJson(reader, CobbleTransformationsConfig.class);
    }

    public static void updateConfig(CobbleTransformationsConfig config){

        File dir = ZCrystals.INSTANCE.getConfigDir();
        Gson gson = Adapters.MAIN_CONFIG_GSON;
        try{
            File file = new File(dir,"competitivebattles.json");
            FileWriter writer = new FileWriter(file);
            String json = gson.toJson(config);
            writer.write(json);
            writer.close();
        }
        catch (IOException e){
            ZCrystals.INSTANCE.getLog().warn(e);
        }
    }
}
