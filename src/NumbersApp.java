import java.util.Queue;

public class NumbersApp {

    public static void main(String[] args) {


        NumbersQueue numbersQueue = new NumbersQueue();

        Queue<Integer> numbers = numbersQueue.scanAndCreate();

        //System.out.println(numbers.toString());

        numbersQueue.addNPrint(numbers);

    }
}
