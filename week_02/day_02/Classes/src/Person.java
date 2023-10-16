public class Person {

    private String name;
    private String town; //This and the below variables is grayed out because they are private and have not been used with get and set yet.
    private boolean completedCourse;

    //This a constructor
    public Person(String inputName, String inputTown){
        this.name = inputName;
        this.town = inputTown;
        this.completedCourse = false;
    }

    String getName(){

        return this.name;
    }

    void setName(String updatedName){

        this.name = updatedName;
    }


    //Defining the method here

    String greet(String timeOfDay){           //This is called the method signature
        return "Good " + timeOfDay + ", my name is " + this.name + ".";    //This is called the method body
    }

    void finishCourse(){                //This is a void method so no return statement is required
        this.completedCourse = true;
    }
}
