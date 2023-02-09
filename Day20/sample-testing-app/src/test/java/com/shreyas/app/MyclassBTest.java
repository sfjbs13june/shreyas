package com.shreyas.app;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class MyclassBTest {
    @InjectMocks
    MyclassB myclassB;
    @Mock
    MyclassA myclassA;

    @Mock
    MyclassC myclassC;
    @BeforeEach
    void setUp(){
        myclassB= Mockito.mock(MyclassB.class);
        myclassC= Mockito.mock(MyclassC.class);
    }
    @Test
    public void TestgetResult() {
        String result = myclassB.getResult();
        assertEquals("my result", result);
    }
    @Test
    public void TestgetMyString() {
        String result = myclassB.getMyString("hello");
        assertEquals("my resulthello", result);
    }
    @Test
    public void TestgetClassCRestult() {
        when(myclassC.getMyAge(anyInt())).thenReturn(35);
        int result = myclassC.getMyAge(25);
        assertEquals(35, result);
    }
    @Test
    public void TestNoreturnData()
    {
        myclassB.NoreturnData("my data");
        String result = "my data";
        assertEquals("my data",result);
    }


}
