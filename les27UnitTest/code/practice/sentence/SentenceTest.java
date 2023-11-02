package practice.sentence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {
    Sentence sentence;// поле класса типа Sentence

    @BeforeEach
    void setUp() {
        sentence = new Sentence();// вызвали пустой конструктор который есть

    }

    @Test
    void countWords() {
        String str ="One two - three,four .";
        assertEquals(4,sentence.countWords(str));
    }

    @Test
    void countSymbols() {
        String str = "One? Two. Three%";
        assertEquals(16,sentence.countSymbols(str));
    }
}