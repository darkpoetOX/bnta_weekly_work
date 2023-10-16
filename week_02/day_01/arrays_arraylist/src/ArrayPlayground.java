public class ArrayPlayground {

    public static void main(String[] args) {

//        String[] trainers = {"Colin", "Zsolt", "Ed"};
//
//        String firstTrainer = trainers[1];

//        System.out.println(firstTrainer);

        String[] trainers = new String[3];

        trainers[0] = "Colin";
        trainers[1] = "Zsolt";
        trainers[2] = "Ed";


        System.out.println(trainers[1]);

        trainers[2] = "Anna";

        int numberOfTrainers = trainers.length;

        System.out.println("number of trainers: " + numberOfTrainers);

    }
}
