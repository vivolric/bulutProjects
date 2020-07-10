package Repl_It_Questions.Class_tryCatch_Constructor;

public class classObject_3 {
}


// PLEASE COPY THE CODES FROM LINE 10 TO PASTE ON REPLIT, OTHERWISE INTELLIJ GIVES AN ERROR


//import java.util.*;
//
//
//class Total{
//
//    public double stringToDouble (String str){
//
//        double result= Double.parseDouble(str.replace("$", "").trim());
//
//        return result;
//    }
//
//    public double getTotal (LinkedHashMap<String,String> map){ //(key,value)
//
//        double sum = 0;
//        for (String value : map.values()) {
//            sum += stringToDouble(value);
//        }
//        return sum;
//    }
//
//}
//
//
//class Cart{
//
//    //instance variables
//    String userName; //POINTER
//    LinkedHashMap<String , String> LMap; //LMap isminde bir map olusturacaksin tanimlamasi POINTER RAME POINT
//    // LMap = new LinkedHashMap<>(); tanimlanan LMap objesini create ediyorum Bu satir RAM de LMAP isminde bir map create ediyor.
//
//    public void addItem (String str1, String str2){
//        LMap.put(str1,str2);
//    }
//
//    public double getPrice (){
//        Total tot =new Total();
//        double price = tot.getTotal(LMap);
//        return price;
//    }
//
//    public String toString (){
//        return "\nUser name is : "+userName+
//                "\nAll elements are : "+LMap+
//                "\nTotal price : "+getPrice();
//    }
//
//}
//
//class Main {
//
//    public static void main(String[] args) {
//        Cart c = new Cart();
//        c.LMap = new LinkedHashMap<>();
//
//        Scanner scan = new Scanner(System.in);
//        String username = scan.nextLine();
//        c.userName = username;
//        String item1 = scan.nextLine();
//        String item1Price = scan.nextLine();
//        c.addItem(item1,item1Price);
//        String item2 = scan.nextLine();
//        String item2Price = scan.nextLine();
//        c.addItem(item2,item2Price);
//        String item3 = scan.nextLine();
//        String item3Price = scan.nextLine();
//        c.addItem(item3,item3Price);
//
//        System.out.println(c);
//    }
//}

