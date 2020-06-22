package MentoringSessions.Yusuf.May4th;

public class Teacher {
    String name;
    int yearOfExperience;
    String BADegree;

    String howGoodIsTeacher() {
        if (yearOfExperience == 2) {
            return "Not good..";
        } else if (yearOfExperience >= 2 && yearOfExperience < 4) {
            return "Meh not bad, I guess?";
        } else if (yearOfExperience == 4) {
            return "okay this teacher is actually really good.";
        }
        return "";
    }
}
