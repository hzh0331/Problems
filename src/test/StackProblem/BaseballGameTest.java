package test.StackProblem; 

import StackProblem.BaseballGame;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* BaseballGame Tester. 
* 
* @author <Authors name> 
* @since <pre>6月 3, 2021</pre> 
* @version 1.0 
*/ 
public class BaseballGameTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: baseballGame(String[] inputs) 
* 
*/ 
@Test
public void testBaseballGame() throws Exception { 
//TODO: Test goes here...
    BaseballGame baseballGame = new BaseballGame();
    Assert.assertEquals(30, baseballGame.baseballGame(new String[]{"5","2","C","D","+"}));
} 


} 
