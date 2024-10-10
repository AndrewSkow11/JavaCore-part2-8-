import java.util.Arrays;

public class Lesson02 {

    public static void changeValue(int value) {
        value = 22;
    }


    public static void changeValue(Integer value) {
        value = 22;
    }

    public static void changeValue(Integer[] value) {
        value = new Integer[]{1, 2};
        value[0] = 99;
    }

    public static void 