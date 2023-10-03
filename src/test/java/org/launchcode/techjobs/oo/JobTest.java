package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest extends AbstractTest {

//    Job test_job;
//    Job test_job2;
    //TODO: Create your unit tests here



    @Test
    public void testSettingJobId() {


        Job testJob = new Job();
        Job testJob2 = new Job();

assertNotEquals(testJob, testJob2);
    }

    @Test
        public void testJobConstructorSetsAllFields() {
        Job allFieldsTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       Assert.assertTrue(true);
        assertEquals("Product tester", allFieldsTest.getName());
        assertEquals("ACME", allFieldsTest.getEmployer().getValue());
        assertEquals("Desert", allFieldsTest.getLocation().getValue());
        assertEquals("Quality control", allFieldsTest.getPositionType().getValue());
        assertEquals("Persistence", allFieldsTest.getCoreCompetency().getValue());
    }

//    @Test
//    public void testJobsForEquality() {
//        Job equalityTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job equalityTest2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//
//    }

    @Test
    public void testToStringStartsAndEndsWithNewLine (){

        Job emptyJob = new Job();
        String result = emptyJob.toString();

        assertTrue(result.contains(System.getProperty("line.separator")));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job checkFullJobListing =new Job();

        String result = checkFullJobListing.toString();

         assertTrue(result.contains("ID: " + checkFullJobListing.getId()));
        assertTrue(result.contains("Name: " + checkFullJobListing.getName()));
        assertTrue(result.contains("Employer: " + checkFullJobListing.getEmployer()));
        assertTrue(result.contains("Location: " + checkFullJobListing.getLocation()));
        assertTrue(result.contains("Position Type: " + checkFullJobListing.getPositionType()));
        assertTrue(result.contains("Core Competency: " + checkFullJobListing.getCoreCompetency()));

    }

    @Test
    public void testToStringHandlesEmptyField() {
    Job emptyField = new Job();
    String result = emptyField.toString();

        Job emptyFields = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertTrue(false);
        assertEquals("Data not available", emptyFields.getName());
        assertEquals("Data not available", emptyFields.getEmployer().getValue());
        assertEquals("Data not available", emptyFields.getLocation().getValue());
        assertEquals("Data not available", emptyFields.getPositionType().getValue());
        assertEquals("Data not available", emptyFields.getCoreCompetency().getValue());


    }
}