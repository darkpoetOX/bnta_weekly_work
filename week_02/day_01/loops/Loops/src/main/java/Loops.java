import java.lang.reflect.Array;
import java.util.ArrayList;

public class Loops {

    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>();

        colours.add("red");
        colours.add("silver");
        colours.add("green");
        colours.add("hotpink");
        colours.add("hacienda");

        ArrayList<String> filteredColours = new ArrayList<>();

        // This is using a foreach loop
        for (String colour : colours){
            if(colour.charAt(0) == 'h') {
                filteredColours.add(colour);
            }
        }

        System.out.println(filteredColours);

        // This is using a foreach loop
        for(int i = 0; i < colours.size(); i++) {
            if(colours.get(i).equals("hacienda")){
                continue;
            }

            System.out.println(colours.get(i).toUpperCase());
        }
    }
}
