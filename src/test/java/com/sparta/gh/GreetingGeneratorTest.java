package com.sparta.gh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.sparta.gh.GreetingGenerator.*;

class GreetingGeneratorTest {
    private GreetingGenerator greetingGenerator = new GreetingGenerator();

    @ParameterizedTest
    @ValueSource(ints = {5, 12})
    void getMorningTest(int timeOfDay) {
        //Given

        //When
        String result = greetingGenerator.getGreeting(timeOfDay);
        //Then
        //TODO Create an assertion
        Assertions.assertEquals(GOOD_MORNING, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {13, 17})
    void getAfternoonTest(int timeOfDay) {
        //Given

        //When
        String result = greetingGenerator.getGreeting(timeOfDay);
        //Then
        Assertions.assertEquals(GOOD_AFTERNOON, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 4, 19, 23})
    void getEveningTest(int timeOfDay) {
        //Given

        //When
        String result = greetingGenerator.getGreeting(timeOfDay);
        //Then
        Assertions.assertEquals(GOOD_EVENING, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 26})
    void getInvalidTest(int timeOfDay) {
        //Given

        //When
        String result = greetingGenerator.getGreeting(timeOfDay);
        //Then
        Assertions.assertEquals(INVALID, result);
    }
}