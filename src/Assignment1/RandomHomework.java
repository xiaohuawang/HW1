package Assignment1;

import java.util.Random;

//RandomHomework selects a random course name to display to the user.//
public class RandomHomework {

    public static void main(String[] args) {
        RandomHomework randomHomework = new RandomHomework();
        System.out.println(randomHomework.getCourse());
//        System.out.println("end");
    }

    //use random number to pick one course from the four courses and return it.
    public String getCourse() {

        String[] course = new String[4];
        course[0] = "Programming Design Paradigms";
        course[1] = "Object Oriented Design";
        course[2] = "Data Structures and Algorithms";
        course[3] = "Data Mining";

        Random gen = new Random();
        String courePicked = course[gen.nextInt(4)];

        return courePicked;
    }
}
