package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataReader {

    public static String getTestData(String key){
        //E:\NagwaTask\src\main\resources
        String filePath = System.getProperty("user.dir")+"//src//main//resources//TestData.properties";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(filePath));
        } catch (IOException e) {
            System.out.println("Test Data not exist");
            throw new RuntimeException(e);
        }
        return properties.getProperty(key);
    }
}