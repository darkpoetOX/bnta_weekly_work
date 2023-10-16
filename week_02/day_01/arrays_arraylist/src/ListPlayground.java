import java.util.ArrayList;

public class ListPlayground {

    public static void main(String[] args) {

        ArrayList<String> trainers = new ArrayList();

        trainers.add("Colin");
        trainers.add("Zsolt");
        trainers.add("Ed");

        trainers.indexOf("Zsolt");

        trainers.remove(0);

//        String firstTrainer = trainers.get(2);

//        System.out.println("First trainer: " + firstTrainer);

        System.out.println("number of Trainers: " + trainers.size());

        System.out.println("zsolt is in now position: " + trainers.indexOf("Zsolt"));


    }
}
