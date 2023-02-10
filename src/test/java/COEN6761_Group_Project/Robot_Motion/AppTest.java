package COEN6761_Group_Project.Robot_Motion;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    int n = 5;
    private Robot robot = new Robot();
    //private int[][] floor = new int[n][n];
    
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testInitializeSystem() {
        robot.initializeArrayFloor(10);
        assertTrue(robot.penUp()==true);
        assertEquals(0, robot.floor[0][0]); //return true if y,x values = [x],[y]
        assertArrayEquals(new int[] {0, 0}, robot.currentPosition()); // current position after initializing

    }

    @Test
    public void testMoveForward() {
        robot.initializeArrayFloor(10);
        robot.penDown();
        robot.moveForward(4);
        assertArrayEquals(new int[] {4, 0}, robot.currentPosition()); // current position after moving forward
        assertEquals(1, robot.floor[0][4]); //return true if y,x values = [x],[y]
  }
   
}
