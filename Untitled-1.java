import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int nbFloors = in.nextInt(); // number of floors
        int width = in.nextInt(); // width of the area
        int nbRounds = in.nextInt(); // maximum number of rounds
        int exitFloor = in.nextInt(); // floor on which the exit is found
        int exitPos = in.nextInt(); // position of the exit on its floor
        int nbTotalClones = in.nextInt(); // number of generated clones
        int nbAdditionalElevators = in.nextInt(); // ignore (always zero)
        int nbElevators = in.nextInt(); // number of elevators

        int[]elevatorArray = new int[nbElevators+1];

        for (int i = 0; i < nbElevators; i++) {
            int elevatorFloor = in.nextInt(); // floor on which this elevator is found
            int elevatorPos = in.nextInt(); // position of the elevator on its floor
            elevatorArray[elevatorFloor] = elevatorPos;
        }

        // game loop
        elevatorArray[exitFloor] = exitPos;
        while (true) {
            int cloneFloor = in.nextInt(); // floor of the leading clone
            int clonePos = in.nextInt(); // position of the leading clone on its floor
            String direction = in.next(); // direction of the leading clone: LEFT or RIGHT
            if( clonePos >= 0 ){
               // if ( elevatorArray.length > 0 ) {
                System.err.println("cloneFloor: " + cloneFloor + ", clonePos: " + clonePos + ", elevatorPos: " + elevatorArray[cloneFloor]);
                if( clonePos > elevatorArray[cloneFloor] && direction.equals( "RIGHT" ) ){
                     System.out.println("BLOCK");
                }
                if( clonePos < elevatorArray[cloneFloor] && direction.equals( "LEFT" ) ){
                    System.out.println("BLOCK");
                }
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println("WAIT"); // action: WAIT or BLOCK
        }
    }
}