package com.example.user.eightball;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 17/08/2016.
 */
public class AnswersFromSimpleStringsTest {
    Answers answers;
    @Before
    public void before() {
        ArrayList<String> myArray = new ArrayList<String>();
        myArray.add("Yes");
        myArray.add("No");
        answers = new AnswersFromSimpleStrings(myArray);
    }
    @Test
    public void getAnswersTest(){
        assertNotNull(answers.getAnswers());
    }

    @Test
    public void getLenghtTest(){
    assertEquals(2, answers.getLength());
    }

    @Test
    public void getAnswerAtIndexTest(){
        assertEquals("Yes", answers.getAnswerAtIndex(0));
    }





}
