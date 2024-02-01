import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace1() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed1() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  //Beginning of added test
  @Test
  public void testReversed2() {
    int[] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversed3() {
    int[] input1 = {2,2,2};
    assertArrayEquals(new int[]{2,2,2}, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversed4() {
    int[] input1 = {5};
    assertArrayEquals(new int[]{5}, ArrayExamples.reversed(input1));
  }
  @Test
  public void reverseInPlace2() {
    int[] input1 = {1,2,3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3,2,1}, input1);
  }
  @Test
  public void reverseInPlace3() {
    int[] input1 = {2,2,2};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{2,2,2}, input1);
  }
  @Test
  public void reverseInPlace4() {
    int[] input1 = {5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5}, input1);
  }
  @Test
  public void averageWithoutLowest1() {
    double[] input1 = {2.0,5.0,5.0,2.0};
    double i = 5.0;
    assertEquals(i, ArrayExamples.averageWithoutLowest(input1), 0.00001);
  }
}
