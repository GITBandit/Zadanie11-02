import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NumbersQueue {



        public Queue<Integer> scanAndCreate() {

            LinkedList<Integer> list = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);

            for(int i = 0; i<10; i++){
                list.offer(scanner.nextInt());
            }

            return list;

        }

        public void addNPrint(Queue<Integer> queue){
            int count = 0;
            int sum = 0;
            while (!queue.isEmpty()) {
                if(count != 0){
                    System.out.print(" + ");
                }
                int x = queue.poll();
                System.out.print(x);
                sum += x;
                count++;
            }
            System.out.println(" = " + sum);
        }


}
