package com.sparta.gh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.sparta.gh.FilmClassifications.*;

class FilmClassificationsTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 11})
    void getUnderTwelveTest(int ageOfViewer) {
        //Given

        //When
        String result = FilmClassifications.availableClassifications(ageOfViewer);
        //Then
        Assertions.assertEquals(UNDER_TWELVE, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 14})
    void getUnderFifteenTest(int ageOfViewer) {
        //Given

        //When
        String result = FilmClassifications.availableClassifications(ageOfViewer);
        //Then
        Assertions.assertEquals(UNDER_FIFTEEN, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 17})
    void getUnderEighteenTest(int ageOfViewer) {
        //Given

        //When
        String result = FilmClassifications.availableClassifications(ageOfViewer);
        //Then
        Assertions.assertEquals(UNDER_EIGHTEEN, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 77})
    void getOverEighteenTest(int ageOfViewer) {
        //Given

        //When
        String result = FilmClassifications.availableClassifications(ageOfViewer);
        //Then
        Assertions.assertEquals(EIGHTEEN_AND_OVER, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0})
    void getInvalidTest(int ageOfViewer) {
        //Given

        //When
        String result = FilmClassifications.availableClassifications(ageOfViewer);
        //Then
        Assertions.assertEquals(INVALID, result);
    }
}