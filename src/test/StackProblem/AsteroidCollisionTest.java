package test.StackProblem; 

import StackProblem.AsteroidCollision;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

/** 
* AsteroidCollision Tester. 
* 
* @author <Authors name> 
* @since <pre>6月 3, 2021</pre> 
* @version 1.0 
*/ 
public class AsteroidCollisionTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: asteroidCollision(int[] inputs) 
* 
*/ 
@Test
public void testAsteroidCollision() throws Exception { 
//TODO: Test goes here...
    AsteroidCollision asteroidCollision = new AsteroidCollision();
    int[] inputs = new int[]{5, 10, -5};
    List<Integer> first  = asteroidCollision.asteroidCollision(inputs);
    List<Integer> second = Arrays.asList(5, 10);
    assertTrue(first.size() == second.size() && first.containsAll(second) && second.containsAll(first));

    inputs = new int[]{10, 2, -5};
    first  = asteroidCollision.asteroidCollision(inputs);
    second = Arrays.asList(10);
    assertTrue(first.size() == second.size() && first.containsAll(second) && second.containsAll(first));
} 


} 
