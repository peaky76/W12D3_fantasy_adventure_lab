package helper;

import behaviours.Describeable;
import behaviours.Possessable;

import java.util.ArrayList;

public class Helper {

    public static int getRandomIntInRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static String indefiniteArticle(String followingWord) {
        char firstLetter = followingWord.toCharArray()[0];
        if (isVowel(firstLetter)) return "an";
        return "a";
    }

    public static Boolean isVowel(char letter) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels) {
            if (vowel == letter) {
                return true;
            }
        }
        return false;
    }

    public static String stringifyArrayList(ArrayList arrayList) {
        String stringifiedList = "";
        for (Object item: arrayList) {
            stringifiedList += item.toString() + "\n";
        }
        return stringifiedList;
    }
}
