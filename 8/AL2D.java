import java.security.AlgorithmConstraints;
import java.util.ArrayList;

public class AL2D{
    public static void main(String[] args) {
        ArrayList<String>[][] aList=new ArrayList[2][2];
        for (int i = 0; i < 2; i++) {
            aList[0][i]=new ArrayList<String>();
            aList[1][i]=new ArrayList<String>();
        }
        aList[0][0].add("Happy");
        aList[0][1].add("Birthday");
        aList[1][0].add("Yoga");
        aList[1][1].add("Permana");

        System.out.println(aList[0][0]);
        System.out.println(aList[1][1]);
    }
}