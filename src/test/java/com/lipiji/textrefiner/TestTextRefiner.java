package com.lipiji.textrefiner;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTextRefiner {

    @Test
    public void filterPunctuation() {
        assertEquals("This is a cat", TextRefiner.filterPunctuation("This, is. a cat!$"));
    }

    @Test
    public void toSentences() {
        String str = "This is how I tried to split a paragraph into a sentence. But, there is a problem. My paragraph includes dates like Jan.13, 2014 , words like U.S and numbers like 2.2. They all got splitted by the above code.";
        assertEquals("This is how I tried to split a paragraph into a sentence.", TextRefiner.toSentences(str).get(0));
    }
}
