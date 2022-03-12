import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Task {
    public static void main(String[] args){
        Task t = new Task();
        JsonObject doc = t.readJson("./resources/restaurant-data.json");
        Database db = new Database(doc);
        System.out.println(db.getRestaurant("Hometown BBQ"));
        System.out.println(db.getAvgReviews("Casa Enrique"));
    }

    public JsonObject readJson(String filename){
        return (JsonObject) Jsoner.deserialize(readFile(filename), new JsonObject());

        }

    public String readFile(String filename){

        String content = "";
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
           String str = reader.readLine();
           while(str != null){
               content += str;
               str = reader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
            System.exit(-1);
        }
            return content;

    }

    }


