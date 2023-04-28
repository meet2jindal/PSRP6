package bench.psrp6;

import java.util.ArrayDeque;
import java.util.Queue;

public class NextGreatestElement {
    public static void main(String[] args) {
        int[] nums = {15, 10, 8, 7, 6};
        nge2(nums);
    }


    private static void nge2(int[] nums) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int next = nums[i];
            if (queue.isEmpty()) {
                queue.add(next);
            } else {
                int element = queue.peek();
                if (next < element) {
                    queue.add(next);
                } else {
                    processElement(queue, next, element);
                    queue.add(next);
                }
            }


        }
        while (!queue.isEmpty()){
            System.out.println(queue.remove() + "->" + -1);
        }
    }

    private static void processElement(Queue<Integer> queue, int next, int element){
        while (!queue.isEmpty() && next > element) {
            System.out.println(element + "->" + next);
            queue.remove();
            if (!queue.isEmpty())
                element = queue.peek();
        }
    }
}
