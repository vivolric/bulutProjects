package MentoringSessions.Ali.April10;

public class two2DArrayExample {
    public static void main(String[] args) {

        String[][] cities = {{"New york", "Atlanta", "Cincinnati", "Istanbul"}, {"London", "Paris"}, {"Rome"}};

//              print all the values in the array
//        for(int i = 0 ; i<cities.length ; i++){    --> i is for arrays, j is for values yani icindekiler London gibi
//
//            for(int j = 0 ; j<cities[i].length ; j++){
//
//                System.out.println(cities[i][j]);
//
//            }
//        }

//      find the istanbul from the 2d array  or new york from the 2d array

        for (int i = 0; i < cities.length; i++) {

            for (int j = 0; j < cities[i].length; j++) {

                if (cities[i][j].equals("Istanbul") || cities[i][j].equals("London")) {
                    // burda rome 3. arrayde 0. value yer aliyor, NY ise arrayi ve valuesi 0 cunku ilk sirada yer aliyor

                    System.out.println(i + " " + j + " " + cities[i][j]);

                }

            }

        }


    }
}
