package MentoringSessions.Yusuf.April15th;

public class Task1 {

    //Task 1
    //Write a method that will tell you how many words there are in a string

    public static void main(String[] args) {
        wordCount("I really love this topic");
    }

    public static void wordCount(String str) {
        String[] arr = str.split(" ");
        System.out.println("You have " + arr.length + " words in your string.");
    }
}


