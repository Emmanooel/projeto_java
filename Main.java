import co.pokeapi.Pokemon;
import co.pokeapi.RequestPokemon;
import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
        try{
            String b = RequestPokemon.getPokemon(1);
            Pokemon bulbasaur = new Gson().fromJson(b, Pokemon.class);

            System.out.println();
            System.out.println();
            print(bulbasaur);

        } catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }


    public static void print (Object obj){

        Field[] fields = obj.getClass().getFields();
        for (int i = 0; i< fields.length; i++){
            Field field = fields[i];
            String name = field.getName();
            Type type = field.getGenericType();
            Object value;
            try{
                value = field.get(obj);
            } catch (IllegalArgumentException | IllegalAccessException e){
                value = "!!!";
            }

            System.out.println(name + " (" + type +") = " + value);
        }
    }
}
