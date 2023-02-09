package com.shreyas.app;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyclassCTest {

    @RunWith(MockitoJUnitRunner.class)
    public class MyClassCTest {
        @InjectMocks
        MyclassC myclassC;

        @Test
        public void TestgetMyAge()
        {
            int result = myclassC.getMyAge(20);
            assertEquals(20, result);
        }

    }
}
