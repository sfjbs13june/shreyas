package com.shreyas.app;

import com.shreyas.app.controller.StudentController;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StudentControllerTest {

    StudentController studentController = new StudentController();

    @Test
    public void testGetStudent(){
        String getstudentSize= String.valueOf(studentController.getStudents().size());
        Assert.assertEquals("4",getstudentSize);
    }
    @Test
    public void testMapStudent(){
        String mapstudentSize=String.valueOf(studentController.mapStudents().size());
        Assert.assertEquals("4",mapstudentSize);
    }
}
