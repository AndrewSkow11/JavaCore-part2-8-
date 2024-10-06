public class PesonSevice {
    public void setAgeEighteen(Person person){
        person.setAge(18);
        person.child = new Person("Marcus", 30);
    }

    public void changePersonToDani(Person person){
        person = new Person("Dani", 26);

        /* Сборщик мусора удаляет также объекты, который ссылаются друг
        на друга и образуют кольцевую структуру.
         */

        Person padme = new Person("Padme", 26);
        Person luke = new Person("Luke", 19);

        padme.child = luke;
        luke.parent = padme;

    }
}
