public class Lesson01 {
    public static void main(String[] args) {

        System.out.println("01. Память в Java");

        /* Если у метода параметр - объект и если в этот параметр
         * вписать указатель на новый объект, то снаружи метода в
         * переменной, которую мы передавали в метод, так и
         * останется старый объект.*/

        // у строки нет методов, который могут её изменить

        // В Java всё передаётся по значению - ВСЁ

        // а в значении переменной записана ссылка на объект

        PesonSevice personService = new PesonSevice();
        Person sarah = new Person("Sarah", 30);


        // command + alt + T - surround with
        // NullPointerException
        if (sarah.child != null) {
            System.out.println("sarah.child.getName() = " + sarah.child.getName());
        } else {
            System.out.println("Object has no child");
        }

        System.out.println(sarah);
        personService.setAgeEighteen(sarah);

        personService.setAgeEighteen(sarah); // изменения произойдут
        System.out.println(sarah);
        personService.changePersonToDani(sarah); // не повлияет на переданный объект
        System.out.println(sarah);

        Person john = new Person("John", 13);
        sarah.child = john;
        personService.setAgeEighteen(sarah); // изменения произойдут

        System.out.println(sarah.child.getName());
        System.out.println(john);

        /* Сборщик мусор - Garbage Collector -
        * инструмент, который находит все объекты в коде,
        * недоступные для программиста и удаляет их. */
        john = null; // обнуление ссылки
        john = new Person("AlterJohn", 30);

    }
}

/* Итоги урока:
* Параметры в Java передаются по значению,
* это значит что они копируются
* параметр примитивного типа -> примитивное значение
* параметр объектного типа <- ссылка на объект
*
* Если передать объект как параметр и поменять значение поля,
* то значение поля поменяется снаружи
*
* Если объект передать как параметр и вписать в параметр
* новый объект с помощью оператора присваивания - снаружи переменная
* будет указывать на старый объект
*
* Если нужно сделать так, чтобы переменная или поле не ссылались
* ни на какой объект, нужно записать туда null.
*
* Если вызвать метод у переменной, которая никуда не указывать, то
* произойдёт ошибка NullPointerException*/

