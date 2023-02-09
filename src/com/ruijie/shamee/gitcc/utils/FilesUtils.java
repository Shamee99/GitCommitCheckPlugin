package com.ruijie.shamee.gitcc.utils;

import java.io.File;
import java.io.IOException;


/**
 * 文本操作工具类
 * @author Shamee Loop
 */
public class FilesUtils {

    public static File getDataCenterJsonFile() {
        File jsonFile = new File("datacenter.json");
        if(!jsonFile.exists()){
            try {
                jsonFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return jsonFile;
    }

}
