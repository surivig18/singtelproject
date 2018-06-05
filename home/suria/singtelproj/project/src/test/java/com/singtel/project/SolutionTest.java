package com.singtel.project;

import com.singtel.constants.AnimalConstants;
import com.singtel.domain.Animal;
import com.singtel.domain.ButterFly;
import com.singtel.domain.ClownFish;
import com.singtel.domain.Fish;
import com.singtel.domain.Shark;
import com.singtel.factory.ButterFlyFacory;
import com.singtel.helperinterfaces.FlyInterface;
import com.singtel.helperinterfaces.TransformedButterFly;

import junit.framework.Assert;
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
    public void testFishInstanceCreation()
    {
    	
    
    	assertNotNull( "Bird object is not created", solution.getAnimalInstance("Fish",null));
    }
    public void testClownFishInstanceCreation()
    {
    	
    
    	assertNotNull( "Bird object is not created", solution.getAnimalInstance("Fish","clownFish"));
    }
    public void testSharkInstanceCreation()
    {
    	
    
    	assertNotNull( "Bird object is not created", solution.getAnimalInstance("Fish","Shark"));
    }
    public void testDolphinInstanceCreation()
    {
    	
    
    	assertNotNull( "Bird object is not created", solution.returnDolphinInstance());
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
    
    public void testParrotSoundWithDog(){
    	Animal animal = solution.getParrotInstance(AnimalConstants.DOG);
    	 animal.sing();
    	
    }
    public void testParrotSoundWithCat(){
    	Animal animal = solution.getParrotInstance(AnimalConstants.CAT);
    	 animal.sing();
    	
    }
    public void testParrotSoundWithRooster(){
    	Animal animal = solution.getParrotInstance(AnimalConstants.ROOSTER);
    	 animal.sing();
    	
    }
    public void testClownFishColor(){
    	Fish clownFish = (ClownFish) solution.getAnimalInstance("Fish","clownFish");
    	clownFish.getColor();
    }
    public void testClownFishSize(){
    	Fish clownFish = (ClownFish) solution.getAnimalInstance("Fish","clownFish");
    	clownFish.getSize();
    }
    public void testSharkColor(){
    	Fish shark = (Shark) solution.getAnimalInstance("Fish","shark");
    	shark.getColor();
    }
    public void testSharkhSize(){
    	Fish shark = (Shark) solution.getAnimalInstance("Fish","shark");
    	shark.getSize();
    }
    
    public void testButterFlyInstance(){
    	ButterFlyFacory butterFlyFacory = new ButterFlyFacory();
    	Assert.assertSame(ButterFly.class, butterFlyFacory.getInstance(AnimalConstants.BUTTERFLLY)) ;
    
    }
    
    public void testCaterPillarInstance(){
    	ButterFlyFacory butterFlyFacory = new ButterFlyFacory();
    	Assert.assertSame(ButterFly.class, butterFlyFacory.getInstance(AnimalConstants.TRANSFROMEDFLY)) ;
    
    }
    
   
    
    
}
