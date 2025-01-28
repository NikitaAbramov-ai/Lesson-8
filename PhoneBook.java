package lesson

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        phoneBook
                .computeIfAbsent(lastName, k -> new ArrayList<>())
                .add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    public void displayAllEntries() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey() + " | Телефоны: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123-456-789");
        phoneBook.add("Иванов", "987-654-321");
        phoneBook.add("Петров", "555-555-555");
        phoneBook.add("Сидоров", "111-222-333");

        System.out.println("Телефонный номер(а) для Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Телефонный номер(а) для Петров: " + phoneBook.get("Петров"));

        System.out.println("\nВсе записи в телефонном справочнике:");
        phoneBook.displayAllEntries();
    }
}
