public class TwoDArray {
    public static void main(String[] args) {

        /*
        String[] fruits = {"Banana", "Apple", "Pineapple"};
        String[] vegetables = {"Brinjal", "Onion", "Potato"};

        String[][] foods = {fruits,vegetables};

        for(String[] food: foods){
            for (int i = 0; i < food.length;i++){
                System.out.println(food[i]);
            }
        }
         */

        char[][] telephone = {{'1','2','3'},
                             {'4','5','6'},
                             {'7','8','9'},
                             {'*','0','#'}};

        for (char[] row: telephone){
            for (char ch:row){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
