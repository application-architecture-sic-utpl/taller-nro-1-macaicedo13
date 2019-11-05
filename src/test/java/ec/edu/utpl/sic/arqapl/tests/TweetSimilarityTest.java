package ec.edu.utpl.sic.arqapl.tests;

import ec.edu.utpl.sic.arqapl.TweetSimilarity;
import static org.junit.Assert.*;

import ec.edu.utpl.sic.arqapl.metrics.Cosine;
import ec.edu.utpl.sic.arqapl.metrics.Jaccard;
import ec.edu.utpl.sic.arqapl.metrics.JaroWinkel;
import org.junit.Test;

public class TweetSimilarityTest {
    public TweetSimilarityTest() {
    }

    @Test
    public void jaccard() {
        var tweet1 = "Hola mundo";
        var tweet2 = "Hola mundo";
        TweetSimilarity ts = new TweetSimilarity(new Jaccard());
            assertEquals(1.0,
                ts.similarity(tweet1, tweet2), 0.1);
    }

    @Test
    public void cosine() {
        var tweet1 = "Hola mundo";
        var tweet2 = "Hola mundo";
        TweetSimilarity ts = new TweetSimilarity(new Cosine());
        assertEquals(1.0,
                ts.similarity(tweet1, tweet2), 0.1);
    }

     @Test
     public void jaro() {
         var tweet1 = "Hola mundo";
         var tweet2 = "Hola mundo";
         TweetSimilarity ts = new TweetSimilarity(new JaroWinkel());
         assertEquals(1.0,
                 ts.similarity(tweet1, tweet2), 0.1);
     }

 }