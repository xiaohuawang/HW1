package Assignment1;

import java.util.Random;

//RandomHomework selects a random course name to display to the user.//
public class RandomHomework {


    /**
     * Uses a RandomHomework object to print
     * a random course name to the console.
     */
    public static void main(String[] args) {
        RandomHomework randomHomework = new RandomHomework();
        System.out.println(randomHomework.getCourse());
    }

    /**
     * @return a random course name from a list of four possible courses.
     */
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
