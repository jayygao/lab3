import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {3,2,1};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{1,2,3}, input2);

    // len = 3, 3 - 0 - 1 = 2 @ 0, 3 - 1 - 1 = 1 @ 1, 3 - 2 - 1 = 0 @ 2.
    // 3 2 1 = 1, 2, 1
	}

  //ReverseInPlace fails to replace the last value in the array
  //with the original value at 0, replacing the last value with
  //the value in 0 that was already replaced by the last in the array.
  @Test 
	public void testReverseInPlace2() {
    int[] input3 = {3,2};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{2,3}, input3);

    //len = 2, 2 - 0 - 1 = 1 @ 0, 2 - 1 - 1 = 0 @ 1
    // 3, 2 = 2, 2
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = {3,2,1};
    assertArrayEquals(new int[]{1,2,3}, ArrayExamples.reversed(input2));

    //out of bounds, empty array, can't copy
  }
}