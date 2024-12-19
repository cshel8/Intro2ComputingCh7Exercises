import java.util.Scanner;
public class Entry {
    public static void main(String[] args) {
        Menu menu = new Menu();
        GradeController controller = new GradeController();
        Scanner keyboard = new Scanner(System.in);
        char choice = 'Q';
        do {
            menu.displayMenu();
            String input = keyboard.nextLine().trim();
            if(input.length() == 0)
                continue;
            choice = input.toUpperCase().charAt(0);
            String entry = "";
            switch (choice) {
                case 'A':
                    entry = controller.getInput("Enter a student and grade", keyboard);
                    String name = entry.split(" ") [0];
                    int grade = Integer.parseInt(entry.split(" ")[1]);
                    controller.addStudentRecord(name, grade);
                    break;
                case 'R':
                    entry = controller.getInput("Enter a student and grade", keyboard);
                    name = entry.split(" ")[0];
                    controller.deleteStudentRecord(name);
                    break;
                case 'E':
                    controller.showStats();
                    break;
                case 'M':
                    entry = controller.getInput("Enter a student and grade", keyboard);
                    name = entry.split(" ")[0];
                    grade = Integer.parseInt(entry.split(" ")[1]);
                    controller.modifyStudentRecord(name, grade);
                    break;
                case 'S':
                    controller.showAllRecords(keyboard);
                    break;
                default:
            }
        }while (choice != 'Q');
    }
}
