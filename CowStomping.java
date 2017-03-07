import java.util.*;
import java.io.*;
public class CowStomping{
    int [][] pasture;
    int [][] order;
    int  elevation;
    public CowStomping(String file) {
    try{
        Scanner sc = new Scanner(new File(file));
        //Instatiating variables
        String fl = sc.nextLine();
        Scanner flscan = new Scanner(fl);
        int r =flscan.next();
        int c = flscan.next();
        elevation = flscan.next();
        int n = flscan.next();
        pasture= new int[r][c];
        order= new int[n][3];
        //Loading pasture
        for (int i=0; i < r; i++){
        // Visits every int
        Scanner lineScan = new Scanner(sc.nextLiyne());
        for (int e=0; e<c; e++){
            pasture[i][e]=lineScan.next();
        }
        }
        //Loading Orders

    }
    /*catch{
        
    }
    */
    } 
}
