package com.singtel.project;

import com.singtel.domain.Animal;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SolutionTest 
    extends TestCase
{
	Solution solution = null;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SolutionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SolutionTest.class );
    }
    
    @Override
    public void setUp(){
    	 solution = new Solution();
    }

    /**
     * Rigourous Test :-)
     */
  
    public void testBirdInstanceCreation()
    {
    	
    
    	assertNotNull( "Bird object is not created", solution.getAnimalInstance("Bird"));
    }
    
    public void testBirdSing()
    {
    	Animal animal = solution.getAnimalInstance("Bird");
    	animal.sing();
    }
    
    public void testBirdFly(){
    	Animal animal = solution.getAnimalInstance("Bird");
    	 animal.fly();
    	
    }
}
