package org.launchcode.techjobs.oo;

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
    public void emptyLine (){

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

//    @Test
//    public void testJobsForEquality() {
//        Job job1 = new Job("Tech", "UBC", "STL", "full-time");
//        Job job2 = new Job("Tech", "ESI", "Atlanta", "part-time");
//assertEquals(job1, job2);
//
//
//    }
}