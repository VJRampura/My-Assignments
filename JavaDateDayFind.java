import java.io.*;
import java.util.regex.*;
import java.time.LocalDate;

class Result {
    public static String findDay(int month, int day, int year) {
              return LocalDate.of(year, month, day).getDayOfWeek().name();
    }

}

public class JavaDateDayFind {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		System.out.println("Enter Date in 'DD MM YYYY' Format : ");
        String[] arr1 = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(arr1[1]);

        int day = Integer.parseInt(arr1[0]);

        int year = Integer.parseInt(arr1[2]);

        //String res = Result.findDay(month, day, year);
        String res = LocalDate.of(year, month, day).getDayOfWeek().name();

		System.out.println("Day is : "+ res);
        //bufferedWriter.write(res);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
