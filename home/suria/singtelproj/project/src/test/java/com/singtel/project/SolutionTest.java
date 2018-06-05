package com.singtel.project;

import com.singtel.constants.AnimalConstants;
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
    	
    
    	assertNotNull( "Bird object is not created", solution.getAnimalInstance("Bird",null));
    }
    public void testChickenInstanceCreation()
    {
    	
    
    	assertNotNull( "Bird object is not created", solution.getAnimalInstance("Bird",AnimalConstants.CHICKEN));
    }
    
    public void testBirdSing()
    {
    	Animal animal = solution.getAnimalInstance("Bird",null);
    	animal.sing();
    }
    public void testBirdFly(){
    	Animal animal = solution.getAnimalInstance("Bird",null);
    	 animal.fly();
    	
    }
    
    public void testDuckInstanceCreation()
    {
    	
    
    	assertNotNull( "Bird object is not created", solution.getAnimalInstance("Bird",AnimalConstants.DUCK));
    }
    public void testRoosterInstanceCreation()
    {
    
    	assertNotNull( "Bird object is not created", solution.getAnimalInstance("Bird",AnimalConstants.ROOSTER));
    }
    
    public void testRoosterSound(){
    	Animal animal =  solution.getAnimalInstance("Bird",AnimalConstants.ROOSTER);
    	 animal.sing();
    	
    }
  
    public void testChickenFly(){
    	Animal animal = solution.getAnimalInstance("Bird",AnimalConstants.CHICKEN);
    	 animal.fly();
    	
    }
    public void testChickenSound(){
    	Animal animal = solution.getAnimalInstance("Bird",AnimalConstants.CHICKEN);
    	 animal.sing();
    	
    }
    
    public void testDuckSound(){
    	Animal animal = solution.getAnimalInstance("Bird",AnimalConstants.DUCK);
    	 animal.sing();
    	
    }
    
}
