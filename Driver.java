import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Driver
{
    public static void main( String [] args ) throws FileNotFoundException
    {
        File infile = new File( "WorldPopulation2025.csv" );
        Scanner in = new Scanner( infile );
        in.nextLine(); // Reading in the header row
        String smallestCountry = "";
        int smallestPop = Integer.MAX_VALUE;
        while( in.hasNext() )
        {
            String line = in.nextLine();
            String [] data = line.split( "," );
            int pop = Integer.parseInt( data[ 1 ] );
            if( pop < smallestPop )
            {
                smallestCountry = data[ 0 ];
                smallestPop = pop;
            }
        }
        
        System.out.println( smallestCountry + ": " + smallestPop );
        in.close();
    }
}