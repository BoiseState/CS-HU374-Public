package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import a2.Grid;

public class GridTest {
	private final boolean DEBUG = true;
	@Test
	public void test1() {
		 int[][] myBoard = {{0,1},{1,2}};
		 if(DEBUG)printArray(myBoard);
		 Grid.update(myBoard, 2,2);
		 if(DEBUG)printArray(myBoard);
		 //get the oracle by getting the results from printArray in the line above
		 int[][] oracle = {{0,0},{0,2}};
		 if(DEBUG)printArray(oracle);
		 assertTrue(eq2DArrays(myBoard, oracle));
	}
	
	
	/* Helper methods for you */
	public static void printArray(int[][] myBoard) {
		 for(int i=0; i < myBoard.length; i++) {
			 System.out.println(Arrays.toString(myBoard[i]));
		 }
		 System.out.println("---");
	 }
	
	private static boolean eq2DArrays(int[][] myBoard, int[][] otherBoard) {
		boolean ret = true;
		if(myBoard.length != otherBoard.length) {
			ret = false;
		} else {
		 for(int i = 0; i < myBoard.length; i++) {
			 if(!Arrays.equals(myBoard[i], otherBoard[i])) {
				 ret = false;
				 break;
			 }
		 }
		}
		return ret;
	 }

}
