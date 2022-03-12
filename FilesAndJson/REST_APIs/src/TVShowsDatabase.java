import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TVShowsDatabase {

    String baseUrl = "http://api.tvmaze.com/search/";

    public String getURLSource (URL show) throws IOException {
        String data = "";
        //URL url = new URL(baseUrl + "i=" + show);
        Scanner input = new Scanner(show.openStream());

        while (input.hasNext())
            data += input.nextLine();

        input.close();
        data = "{\"result\":" + data + "}";
        return data;


    }

    public JsonObject getShowsByName(String name) throws Exception
    {
        URL url = new URL(baseUrl+"shows?q="+name);
        String data = getURLSource(url);
        return (JsonObject)Jsoner.deserialize(data, new JsonObject());


    }

    public JsonObject getPeopleInShows(String query) throws Exception
    {
        URL url = new URL (baseUrl+"people?q="+query);
        String data = getURLSource(url);
        return (JsonObject)Jsoner.deserialize(data, new JsonObject());


    }

    public String formatShowAsString(JsonObject doc){
        String results = "";
        JsonArray shows = (JsonArray) doc.get("result");
        for (int i =0; i < shows.size(); i++){
            JsonObject show = (JsonObject)((JsonObject)shows.get(i)).get("show");
            String name = (String ) show.get("name");
            String link = (String ) show.get("url");
            BigDecimal rating = (BigDecimal)((JsonObject) show.get("rating")).get("average");
            String summary = (String ) show.get("summary");

            results += "Name:" + name + "\n" + "Link:" + link + "\n" + "Rating Average:" + rating + "\n" + "Summary:" + summary + "\n";
        }
        return results;
    }



    public void saveShows(String text, String outfile){
        try{
            FileOutputStream output = new FileOutputStream(outfile);
            output.write(text.getBytes(StandardCharsets.UTF_8));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}




