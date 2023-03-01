package io.github.tainafernandes.Target.questions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SecondQuestionTest {

    @Test
    @DisplayName("Must check if the number is fibonacci")
    void verifyFibonacci() {
        assertEquals(false, SecondQuestion.verifyFibonacci(23));
        assertEquals(true, SecondQuestion.verifyFibonacci(13));
        assertEquals(false, SecondQuestion.verifyFibonacci(60));
        assertEquals(true, SecondQuestion.verifyFibonacci(34));
    }
}