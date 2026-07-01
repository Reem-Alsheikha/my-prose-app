package de.htw_berlin.fb4.ossd.reem;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class FirstSentence implements Sentence {

    @Override
    public String get() {
        return "This is my first collaborative sentence.";
    }
}