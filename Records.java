import java.util.HashMap;
import java.util.Map;
public class Records {
    private Map<String, Double> records;
    public Records(){
        records = new HashMap<>();
    }
    public boolean addRecord(String name, double grade){
        if(records.put(name, grade) != null)
            return true;
        else
            return false;
    }
    public boolean delRecord(String name) {
        if (records.remove(name) != null)
            return true;
        else
            return false;
    }
    public void evaluate() {
        System.out.println("Lowest score: " + getMinScore());
        System.out.println("Highest score: " + getMaxScore());
        System.out.println("Average score: " + getAverageScore());
    }
    public boolean modRecord(String name, double newGrade){
        records.remove(name);
        if (records.put(name, newGrade) != null)
            return true;
        else
            return false;
    }
    public void showAllRecords() {
        for( Map.Entry<String, Double> entry : records.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() );
        }
    }
    private double getMinScore() {
        double min = Double.MAX_VALUE;
        for (double grade : records.values()) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }
    private double getMaxScore() {
        double max = Double.MIN_VALUE;
        for (double grade : records.values()){
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }
    private double getAverageScore() {
        if (records.isEmpty()){
            return 0.0;
        }
        double total = 0.0;
        for (double grade : records.values()){
            total += grade;
        }
        return total / records.size();
    }
}