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

    public static void main(String[] args) {

        System.out.println("\nTask 5");
        int value = 33;
        changeValue(value);
        System.out.println("value = " + value); // изменения не будет
        // так как в методе создаётся копия объекта и она никак не
        // повлияет на переданный ответ
        // В Java всё передаётся по значению, а не по ссылке


        System.out.println("\nTask 6");
        Integer valueInteger = 33;
        changeValue(valueInteger);
        System.out.println("valueInteger = " + valueInteger);
        // значение также не поменяется


        System.out.println("\nTask 7");
        Integer[] integerArray = new Integer[]{3, 4};
        changeValue(integerArray);
        System.out.println(Arrays.toString(integerArray));
        // метод не изменит значения исходного массива

        System.out.println("\nTask 8");
        // изменение в исходном массиве не будет

        System.out.println("\nTask 9");
        Person2 person2 = new Person2("Ляпис", "Трубецкой");
        person2.changePerson(person2);
        System.out.println("person2 = " + person2);

        System.out.println("\nTask 9");
        // изменения не сохранятся

    }


}
