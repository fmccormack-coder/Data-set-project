import java.io.*;
import java.util.*;


//2.	What is the average height for Females under 25 vs males under 25? 

public class DataSetProject {

     public static void main(String[] args) throws FileNotFoundException{
        avgHeightPer("/Users/fmccormack/Final_data.csv");
    }

    public static void avgHeightPer(String pathname) throws FileNotFoundException {
        

        File f = new File(pathname);
        Scanner sc = new Scanner(f);

        String[] header = sc.nextLine().split(",");
        int gender_index = 1;
        int height_index = 3;
        int age_index = 0; 

        ArrayList<Double> femaleheights = new ArrayList<>();
        ArrayList<Double> maleheights = new ArrayList<>();

        while (sc.hasNextLine()) {
            ArrayList<String> line = new ArrayList<>(Arrays.asList(sc.nextLine().split(",")));

            double age = Double.parseDouble(line.get(age_index));

            double height = Double.parseDouble(line.get(height_index));
            
            if (age < 25 && line.get(gender_index).equals("Female")){
                femaleheights.add(height);
            } else if(age < 2 && line.get(gender_index).equals("Male")){}
                    maleheights.add(height);
            }
        

        double femaleAvg = 0;
        for (Double d: femaleheights) {
            femaleAvg += d;
        }

        double maleAvg = 0;
        for (Double d: maleheights) {
            
            maleAvg += d;
        }

        femaleAvg /= femaleheights.size();
        maleAvg /= maleheights.size();

        System.out.println("What is the average height for Females under 25 vs males under 25?");
        System.out.println("Average height of females under 25:  " + femaleAvg);
        System.out.println("Average height of males under 25:  " + maleAvg );
    }

}



//RED!!
//and filename 
// git commits 