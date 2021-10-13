import java.time.*;
import java.util.*;

public class UserProfile {

    String name;
    int age;
    char gender;
    String jobPreference;
    String nationality;
    char bloodType;

    public UserProfile(String name, char gender, String nationality, char bloodType) {
        this.name = name;
        this.gender = gender;
        this.nationality = nationality;
        this.bloodType = bloodType;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearBorn () {
        int currentYear = Year.now().getValue();;
        return currentYear-age;
    }


    public static void main(String[] args) {
        UserProfile user = new UserProfile("terence",'M', "Singaporean",'O');
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age ");
        String age = sc.nextLine();
        user.setAge(Integer.parseInt(age));
        System.out.println("Year Born Is " + user.getYearBorn());
    }


}



