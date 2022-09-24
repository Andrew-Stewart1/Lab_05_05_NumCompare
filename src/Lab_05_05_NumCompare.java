public class Lab_05_05_NumCompare {
    public Lab_05_05_NumCompare() {
    }
    public static void main(String[] args){
        int number1 = 30;
        int number2 = 30;
        if (number1 == number2){
            System.out.println("The numbers are equal");
        } else if (number1 > number2) {
            System.out.println("Number 1 is greater than Number 2");
        } else if (number1 < number2) {
            System.out.println("Number 2 is greater than Number 1");
        }
    }
}