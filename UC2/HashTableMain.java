package com.bridgelabz.UC2;

public class HashTableMain {
    public static void main(String[] args) {
        HashtableImpl<String, Integer> hashImpl = new HashtableImpl();
        String message = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations";

        String[] messageArray = message.toLowerCase().split(" ");

        for(String word: messageArray) {
            Integer value =  hashImpl.get(word);
            if( value == null)
                value = 1;
            else
                value = value + 1;
            hashImpl.add(word , value);
        }
        System.out.println(hashImpl);
    }
}