package test.StackProblem; 

import StackProblem.DecodeString;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* DecodeString Tester. 
* 
* @author <Authors name> 
* @since <pre>6月 2, 2021</pre> 
* @version 1.0 
*/ 
public class DecodeStringTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: decodeString(String input) 
* 
*/ 
@Test
public void testDecodeString() throws Exception { 
//TODO: Test goes here...
    DecodeString decodeString = new DecodeString();
    Assert.assertEquals("aaabcbc", decodeString.decodeString("3[a]2[bc]"));
    Assert.assertEquals("accaccacc", decodeString.decodeString("3[a2[c]]"));
    Assert.assertEquals("abcabccdcdcdef", decodeString.decodeString("2[abc]3[cd]ef"));
} 

/** 
* 
* Method: productString(String str, int times) 
* 
*/ 
@Test
public void testProductString() throws Exception { 
//TODO: Test goes here... 
} 


} 
