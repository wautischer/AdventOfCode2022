import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = Reader.readFile("data");
        int count = 0;
        int[] calories = new int[lines.size()];

        for (int i = 0; i < lines.size(); i++) {
            if(!lines.get(i).isEmpty()){
                calories[count] += Integer.parseInt(lines.get(i));
            }else {
                count++;
            }
        }
        System.out.println(findElfWithMostCalories(calories));
        System.out.println(findTopThreeElfWithMostCalories(calories));
    }
    public static int findTopThreeElfWithMostCalories(int[] a){
        int first = 0; int second = 0; int third = 0;
        int top3Sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > first){
                third = second;
                second = first;
                first = a[i];
            } else if (a[i] > second && a[i] != first) {
                third = second;
                second = a[i];
            } else if (a[i] > third && a[i] != second) {
                third = a[i];
            }
            top3Sum = first+second+third;
        }
        return top3Sum;
    }
    public static int findElfWithMostCalories(int[] a){
        int min = 0;
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= min){
                min = a[i];
                max = min;
            }
        }
        return max;
    }
}