import java.io.*;
import java.util.*;
import java.lang.*;

public class Encryption {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
            //System.out.println(str.length());
        String strNew;
        char[] strNewChars = new char[100];
        char[] strChars = str.toCharArray();
        int j=0;
        for(int i=0;i<str.length();i++) {
            if(strChars[i] != ' '  ) {
                strNewChars[j++]=strChars[i];
            }
        }
        /*
        int flr = (int) Math.floor( Math.sqrt( str.length() ) );
        System.out.println(flr);
        int cil = (int) Math.ceil ( Math.sqrt( str.length() ) );
        System.out.println(cil);
        
        str=String.valueOf(strNewChars);
        System.out.println(str);
        */
        int len=0;
        do{}while(strNewChars[len++]!=0);
        //System.out.println(--len);
        --len;
        int row = (int) Math.floor( Math.sqrt( len ) );
        //System.out.println(row);
        int col = (int) Math.ceil ( Math.sqrt( len ) );
        //System.out.println(col);
        if( row*col < len ) {
            row++;
        } 
        //////////////
        int k=0;
        char[][] sol = new char[row][col];
        for(int i=0;i<row&&k<len;i++) {
            for(j=0;j<col&&k<len;j++) {
                sol[i][j]=strNewChars[k++];
 //               System.out.print(sol[i][j]);
            }
            //System.out.println("");
        }

        //System.out.println("-----");

        for(int i=0;i<col;i++) {
            for(j = 0;j<row;j++) {
                if(sol[j][i]==0) continue;
                System.out.print(sol[j][i]);
            }
            System.out.print(" ");
        }
    }
}
