package ru.geekbrains.lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    private HashMap<String, List<String>> phoneBook = new HashMap<>();
    private List<String> userPhoneNumber;

    public void add(String userName, String userPhone) {
        if (phoneBook.containsKey(userName)) {
            userPhoneNumber = phoneBook.get(userName);
        } else {
            userPhoneNumber = new ArrayList<>();
        }
        userPhoneNumber.add(userPhone);
        phoneBook.put(userName, userPhoneNumber);
    }

    public List<String> get(String surname) {
        return phoneBook.get(surname);
    }

}



