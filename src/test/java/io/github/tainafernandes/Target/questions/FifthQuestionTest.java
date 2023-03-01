package io.github.tainafernandes.Target.questions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FifthQuestionTest {

    @Test
    @DisplayName("Must reverse the phrase")
    void reversePhrase() {
        assertEquals("987654321", FifthQuestion.reversePhrase("123456789"));
        assertEquals("remoc oma uE", FifthQuestion.reversePhrase("Eu amo comer"));
    }
}