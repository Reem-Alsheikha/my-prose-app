package de.htw_berlin.fb4.ossd.reem;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class SecondSentence implements Sentence {

    @Override
    public String get() {
        return "This is my second sentence from my app.";
    }
}