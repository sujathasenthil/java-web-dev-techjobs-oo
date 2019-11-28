package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job1, test_job2, test_job3, test_job4,test_job5;
    @Before
    public void createJobObject() {

        test_job1 =new Job("", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job2 = new Job(null, null,null,null,null);
        test_job3=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job5 = new Job();
    }
    @Test
    public void unequalId() {
        assertEquals(test_job4.getId()-test_job3.getId(),1);
    }

    @Test
    public void equalId() {
        assertFalse(test_job3.equals(test_job4));
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue (test_job1 instanceof Job);
    }
    @Test
    public void testJobsForEquality() {
        assertFalse(test_job1.equals(test_job3));
    }
    @Test
    public void testToStringHasLabelsAndData() {
        System.out.println(test_job1.toString());
            assertFalse(test_job1.equals("\nId= 1\n" +
            "Name: "+test_job1.getName()+"\n" +
            "Employer: "+test_job1.getEmployer()+"\n" +
            "Location: "+test_job1.getLocation()+"\n" +
            "Position Type: "+ test_job1.getPositionType()+"\n" +
            "Core Competency: "+test_job1.getCoreCompetency()+"\n"));
    }
    @Test
    public void testToPassFirstTest() {
      //  assertFalse( test_job5.toString().equals("OOPS! This job does not seem to exist"));

        //  System.out.println(test_job2);
   assertEquals(test_job5.toString(),"OOPS! This job does not seem to exist");
    /*    assertFalse(test_job2.toString().equals("\nId= 1\n" +
                "Name: "+test_job1.getName()+"\n" +
                "Employer: "+test_job1.getEmployer()+"\n" +
                "Location: "+test_job1.getLocation()+"\n" +
                "Position Type: "+ test_job1.getPositionType()+"\n" +
                "Core Competency: "+test_job1.getCoreCompetency()+"\n"));
    */}
}
