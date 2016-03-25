package com.brainacad.oop.teststokennizer;

import java.util.StringTokenizer;

/**
 * Created by Yuriy on 25.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "Cat,Dog,Pig.Straus Emu";
        StringTokenizer splitSentence = new StringTokenizer(myStr, "( |,|.)");
        while (splitSentence.hasMoreElements()) {
            System.out.println(splitSentence.nextElement());
        }
    }
}
