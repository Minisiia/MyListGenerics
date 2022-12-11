package my_list;

public class Main {
    public static void main(String[] args) {
        MyList<String> listString = new MyList<>();
             // додавання до списку елементів типу String
        listString.add("Aa");
        listString.add("Bb");
        listString.add("Cc");
             // вивід списку до консолі
        for (int i = 0; i < listString.size(); i++) System.out.println(listString.get(i));
             //перевірка методів get() та size()
        System.out.println("За 2 індексом елемент списку: " + listString.get(2));
        System.out.println("Розмір списку: " + listString.size());
             // створення списку із цілочисельних елементів
        MyList<Integer> listInt = new MyList<>();
        for (int i = 1; i < 12; i++) listInt.add(i); // заповнення списку
        for (int i = 1; i < listInt.size(); i++) System.out.println(listInt.get(i));
        System.out.println("За 2 індексом елемент списку: " + listInt.get(2));
        System.out.println("Розмір списку: " + listInt.size());
    }
}
