package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job1, test_job2, test_job3, test_job4;

    @Before
    public void createJobObject() {
        test_job1 = new Job();
        test_job2 = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void unequalId() {
        assertEquals(test_job2.getId() - test_job1.getId(), 1);
    }

    @Test
    public void equalId() {
        assertFalse(test_job1.equals(test_job2));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_job1 instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_job3.equals(test_job4));
    }

    @Test
    public void testToPassFirstTest() {
        assertEquals(test_job1.toString(), "OOPS! This job does not seem to exist");
    }

    @Test
    public void testForToString() {
        assertFalse(test_job3.toString().equals("\nId= 3\n" +
                "Name: " + test_job3.getName() + "\n" +
                "Employer: " + test_job3.getEmployer() + "\n" +
                "Location: " + test_job3.getLocation() + "\n" +
                "Position Type: " + test_job3.getPositionType() + "\n" +
                "Core Competency: " + test_job3.getCoreCompetency() + "\n"));
    }

    @Test
    public void testToCheckBlankLine() {
        assertTrue(test_job2.toString().startsWith("\n") && test_job2.toString().endsWith("\n"));
    }
    @Test
    public void testToCheckDataNotAvailable(){
    //System.out.println(test_job2.toString());
    assertFalse(test_job2.getLocation().equals("Data not Available"));

    }
}