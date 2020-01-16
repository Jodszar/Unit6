/*
Jodie Azar
January 16 2020.
This program demonstrates the birthday paradox. It runs a 1000 times an determines the number of times there are duplicates times.
 */

public class BirthdayParadox {
    public static int[] dates(int num){
        int[] list= new int[num];
        for(int x =0; x<num; x++){
            int y =(int)(Math.random()*364);
            list[x]= y;
        }
        return list;
        // this method randomly picks a day from 0 to 364 in the year.
    }
    public static boolean hasDupes(int[] birthdays){
        for(int x=0; x< birthdays.length; x++){
            for(int y= birthdays.length-1; y>1; y-- ){
                if(birthdays[x]==birthdays[y]){
                    return true;
                }
            }
        }
        return false;
        //this method determines if there are two birthday on the same day.
    }
    public static void main(String[] args){
        int correct= 0;
        for(int x=0; x<1000; x++){ //This runs the birthday paradox 1000 times.
            int[] array = new int[23];
            array= dates(23);
            if(hasDupes(array)){
                correct++;
            }
        }
        double answer= (double)correct/10;// this turns the number into a percentage.
        System.out.println("The percent of times there were duplicate birthdays is " +answer+ "%");
    }

}
