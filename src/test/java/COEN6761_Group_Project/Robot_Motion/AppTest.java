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
    int n = 10;
    private Robot robot = new Robot();
    private int[][] floor = new int[n][n];

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testPenDownAndTracing() {
        robot.penDown();
        robot.moveForward(2);
        assertArrayEquals(new int[] {2, 0}, robot.currentPosition());
        assertFalse(robot.penUp());
        assertEquals(1, floor[2][0]);
    }
    @Test
    public void testMovingOutOfBounds() {
        robot.moveForward(n);
        assertArrayEquals(new int[] {0, n-1}, robot.currentPosition());
    }
}
