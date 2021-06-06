package test.StackProblem; 

import StackProblem.ArithmeticExpressionEvaluation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* ArithmeticExpressionEvaluation Tester. 
* 
* @author <Authors name> 
* @since <pre>6月 5, 2021</pre> 
* @version 1.0 
*/ 
public class ArithmeticExpressionEvaluationTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: infixToPostfix(String s) 
* 
*/ 
@Test
public void testInfixToPostfix() throws Exception { 
//TODO: Test goes here...
    ArithmeticExpressionEvaluation arithmeticExpressionEvaluation = new ArithmeticExpressionEvaluation();
    Assert.assertEquals("1 2 3 + 4 × + 5 -", arithmeticExpressionEvaluation.infixToPostfix("1+((2+3)×4)-5"));
} 

/** 
* 
* Method: Evaluating(String s) 
* 
*/ 
@Test
public void testEvaluating() throws Exception { 
//TODO: Test goes here...
    ArithmeticExpressionEvaluation arithmeticExpressionEvaluation = new ArithmeticExpressionEvaluation();
    Assert.assertEquals(16, arithmeticExpressionEvaluation.evaluating("1 2 3 + 4 × + 5 -"));

} 

/** 
* 
* Method: isHigher(Stack<String> stack, char operator) 
* 
*/ 
@Test
public void testIsHigher() throws Exception { 
//TODO: Test goes here... 
} 


} 
