package helper;

public class Helper {

    public static int getRandomIntInRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static String SnakeCase(String string) {
        return string.replace(" ","_");
    }
}
