package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job1;
    Job test_job2;
    @Before
    public void createJobObject() {
        Job test_job1 = new Job();
        Job test_job2 = new Job();
    }
    @Test
    public void equalId() {
        assertEquals(test_job2.getId()-test_job1.getId(),1);
    }

    @Test
    public void unequalId() {
        assertFalse(test_job1.equals(test_job2));
    }
}
