import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

class Pokemon {
    private String name;
    private String abilities;
    private int base_experience;
    private int height;
    private int id;
    private boolean is_default;
    private int order;
    private String stats;
    private String types;
    private String weight;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAbilities(){
        return abilities;
    }
    public void setAbilities(String abilities){
        this.abilities = abilities;
    }
    public int getBase_experience(){
        return base_experience;
    }
    public void setBase_experience(int base_experience){
        this.base_experience = base_experience;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public boolean getIs_default(){
        return is_default;
    }
    public void setIs_default(boolean is_default){
        this.is_default = is_default;
    }
    public int getOrder(){
        return order;
    }
    public void setOrder(int order){
        this.order = order;
    }
    public String getStats(){
        return stats;
    }
    public void setStats(String stats){
        this.stats = stats;
    }
    public String getTypes(){
        return types;
    }
    public void setTypes(String types){
        this.types = types;
    }
    public String getWeight(){
        return weight;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }
}
