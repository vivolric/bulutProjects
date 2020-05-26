package JavaTechnoStudy.day26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Task1 {

    // create method that generates random numbers and returns in ArrayList<Integer>
    // constraints: bound of random = 10
    //              size of ArrayList , min = 100
    public static ArrayList<Integer> generateNumbers(int randomBound, int size) {
        ArrayList<Integer> result = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            result.add(random.nextInt(randomBound));
        }


        return result;
    }

    // create HashMap and put numbers
    // from ArrayList as key and values should be 0
    public static HashMap<Integer, Integer> generateMap(ArrayList<Integer> numbers) {
        HashMap<Integer, Integer> resultMap = new HashMap<>();
        for (Integer key : numbers) {
            // check if you already have "key" in your map
            // if you have, print ("I have already " + key)
            if (resultMap.containsKey(key)) {
                System.out.println("I have already " + key);
                // print value of corresponding key in resultMap
                Integer value = resultMap.get(key);
                System.out.println("Value " + value);

                // increase value by one and put to resultMap again
                value++;
                resultMap.put(key, value);

            } else {
                resultMap.put(key, 1);
            }
        }
        return resultMap;
    }


    // create method that counts frequency of numbers in list
    // Hint: map, .containsKey(), .get(), .put(), if
    // 0 : 1
    // 1 : 3
    // 4 : 2

    public static void main(String[] args) {
        ArrayList<Integer> numbers = generateNumbers(3, 10);
        HashMap<Integer, Integer> integerIntegerHashMap = generateMap(numbers);
    }

}

//    //2 way, Collections.frequency()
//    public static HashMap<Integer, Integer> getFrequency(ArrayList<Integer> list) {
//        HashMap<Integer, Integer> resultMap = new HashMap<>();
//        for(Integer number : list) {
//            resultMap.put(number, Collections.frequency(list, number));
//        }
//
//        return resultMap;
//    }