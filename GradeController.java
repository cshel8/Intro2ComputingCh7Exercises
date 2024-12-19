import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeController {
    Records records ;
    public GradeController() {
        records = new Records();
    }
    public void addStudentRecord(String name, int grade){
        records.addRecord(name, grade);
    }
    public boolean deleteStudentRecord(String name){
        return records.delRecord(name);
    }
    public boolean modifyStudentRecord(String name, Integer new_grade){
        return records.modRecord(name, new_grade);
    }
    public void showAllRecords(Scanner keyboard){
        records.showAllRecords();
        System.out.println("Enter to continue");
        keyboard.nextLine();
    }
    public void showStats() {
        records.evaluate();
    }
    public String getInput(String prompt, Scanner keyboard){
        System.out.println(prompt);
        String input = keyboard.nextLine();
        return input;
    }
}
