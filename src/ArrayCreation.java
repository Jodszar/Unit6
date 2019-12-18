
public class ArrayCreation {

    public static double getAverage(double[] numbers) {
        double array_avarage;
        if (numbers.length < 3)
            return 0.0;

        else {
            array_avarage = (numbers[0] + numbers[numbers.length / 2]) + numbers[(numbers.length - 1)];
            array_avarage = array_avarage / 3;
            array_avarage = ((array_avarage * 100) + 0.5) / 100;
            array_avarage = (int) array_avarage;

            return array_avarage;
        }
    }

    public static String stringArray(String[] friends) {
        String Friends = "";
        if (friends.length != 5)
            return "";
        else {
            Friends += friends[0].length() + " ";
            Friends += friends[1].length() + " ";
            Friends += friends[2].length() + " ";
            Friends += friends[3].length() + " ";
            Friends += friends[4].length() + " ";
        }
        return Friends;

    }
    public static String countryData(){
        int picker = (int) (Math.random()*13);
        String[] countries= {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan", "Ghana", "Kenya", "Mexico", "United Kingdom", "Burkina Faso", "United States"};
        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra", "Nairobi", "Mexico City", "London", "Ouagadougou", "Washington D.C."};
        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese", "Akuapem Twi", "Swahili", "Spanish", "English", "French", "English"};

        return "The capital of " + countries[picker] + " is " + capitals[picker]+ " and the primary language is " + languages[picker];


    }
    public static void main(String[] args) {
       double[] numbers = {89, 75, 100};
        System.out.println(getAverage(numbers));
        String[] names= {"Fred", "Barney", "Betty", "Wilma", "Pebbles"};
       System.out.println(stringArray(names));
        String[] names2= {"Athos", "Porthos", "Aramis"};
        System.out.println(stringArray(names2));
        System.out.println(countryData());







    }


}

