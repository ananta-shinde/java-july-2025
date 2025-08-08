import java.util.Scanner;

public class Arrayoperations {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc  = new Scanner(System.in);

        // putting values into array one by one
        for(int i=0;i<numbers.length;i++){
            System.out.println("enter a number :");
            numbers[i]=sc.nextInt();
        }

        // traversal or print through array
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        // get index of value from array
        System.out.println("enter a value to be searched :");
        int searchValue =sc.nextInt();
        int searchindex = -1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == searchValue)
            {
                searchindex = i;
            }
        }
        System.out.println("index of searched value is :"+ searchindex);


        // update an array by value
        System.out.println("enter a value to be updated :");
        int oldValue =sc.nextInt();
        System.out.println("enter replacement :");
        int newValue =sc.nextInt();
        for(int i=0;i<numbers.length;i++) {
            if (numbers[i] == oldValue) {
                numbers[i] = newValue;
            }
        }

        // sum of array
        int sum = 0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }

        // largest of array
        int largest = numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest =  numbers[i];
            }
        }

        // smallest of array
        int smallest = numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<smallest){
                smallest =  numbers[i];
            }
        }

        // filter array
        int [] filteredArray = new int[5];
        int count = 0;
        for(int i=0;i< numbers.length;i++){
            if(numbers[i]>40){
                filteredArray[count] = numbers[i];
                count++;
            }
        }

        // avg of array
        sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            sum  = sum + numbers[i];
        }
        float avg = sum/numbers.length;

    }
}
