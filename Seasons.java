import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seasons {
  public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter value here");
    String input = br.readLine();
    String month = input.toLowerCase();

    Season season;
    season = null;

    switch (month) {
      case "december":
      case "january":
      case "february":
        season = Season.WINTER;
        break;
      case "march":
      case "april":
      case "may":
        season = Season.SPRING;
        break;
      case "june":
      case "jule":
      case "august":
        season = Season.SUMMER;
        break;
      case "september":
      case "october":
      case "november":
        season = Season.AUTUMN;
        break;
      default:
        System.out.println("no this month");
    }

    if (season != null) {
      System.out.println(season);
    }
  }
}
