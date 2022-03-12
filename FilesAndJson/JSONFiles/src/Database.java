import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

public class Database {
    private JsonObject restaurants;


    public Database(JsonObject data){
        this.restaurants = data;
    }

    public JsonObject getRestaurant(String name) {

        JsonObject result = null;
        JsonArray restaurant = (JsonArray) this.restaurants.get("restaurants");
        for (int i = 0; i < restaurant.size(); i++) {
            result = (JsonObject) restaurant.get(i);
            if (name.equals(result.get("name")))
                return result;
        }


        return null;
    }

    public double getAvgReviews(String name){
        JsonArray reviews = (JsonArray) getRestaurant(name).get("reviews");
        int size = reviews.size();
        double sum = 0;
        double result = 0.0;
        JsonObject r;
        for (int i = 0; i < size; i++) {
            r = (JsonObject) reviews.get(i);
            sum += Integer.parseInt((r.get("rating")).toString());
        }
        result = sum / size;
        return result;


    }
}
