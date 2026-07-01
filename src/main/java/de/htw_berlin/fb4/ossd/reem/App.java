package de.htw_berlin.fb4.ossd.reem;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;

public class App {

    public static void main(String[] args) {

        ProseBuilder builder = new ProseBuilder();


        builder.register(new FirstSentence());
        builder.register(new SecondSentence());


        builder.register(new FunnySentence());
        builder.register(new SeriousSentence());


        System.out.println(builder.get());
    }
}