package HW1;
// Make a method that accepts a string and an integer and a char and will return the string with the char
// replaced at the integer given
// charReplace("I MAKE BREAD",2,T)
// EX: I MAKE BREAD, 2, T
//     I TAKE BREAD
// remember computer counting starts at 0:
// HELLO
// 01234
// Hint1: The objects name is Replace and you require a string, int, and char
// Hint2: You will need to return a string. You can concat the variables and the strings together
// Hint3: You will need to use the substring method to get the first part of the string and the last part of the string
//        and then concat them together with the char in the middle
// Hint4: You will need to use the charAt method to get the char at the given index
// Hint5: You will need to use the length method to get the length of the string


public class Replace {
    public String charReplace(String str, int index, char c) {
        return charReplace(HELLO, 01234, Void); // replace null with your code
    }
}
public class ClassName{
    private String name;
    private String type;
    private int Subject;

    public ClassName(String newName, String newType, int Subject){
        name = newName;
        type = newType;
        replace = newClassname;
    }

    public int charReplace (int change){
        if (change < 0){
            return Subject - change;
        } else if (change > 0){
            return Subject + change;
        } else if (Subject < 1){
            // string of class grades
        }
    }
    ClassName ObjectName = new ClassName();
    public static void main(String[] args){
        ClassName ObjectName = new ClassName ("MATH", "DegreeWorks", 100);
        ClassName ObjectName = new ClassName ("STATISTICS", "Curriculum", 100);
        ClassName ObjectName = new ClassName ("SCIENCE", "Grade", 100);
    }
