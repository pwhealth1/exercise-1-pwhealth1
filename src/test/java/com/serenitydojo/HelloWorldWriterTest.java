package com.serenitydojo;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class HelloWorldWriterTest {
    
    @Test
    public void validatingIntegerWasWriter() {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.helloWorldWriter();
    }
    @Test
    public void whenWorkingWIthWholeNumbers(){
        int initialYear = 1985;
        int targetYear = 0;
        int timeJump = 2015 - 1985;
        targetYear +=initialYear + timeJump;
        
        
        MatcherAssert.assertThat(targetYear, CoreMatchers.equalTo(2015));
    }
    
    
}