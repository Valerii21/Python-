// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.List;

public class J8 
{
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Киреева");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Лосихина", List.of("+7(999)534-81-56", "+7(220)202-21-12"));
        phoneBook.put("Киреева", List.of("+7(905)143-84-375", "+7(404)184-53-45"));
        phoneBook.put("Петрова",List.of("+7(985)445-45-55", "+7(906)606-56-36"));

    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}