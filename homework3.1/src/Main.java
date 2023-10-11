import java.util.ArrayList;
import java.util.List;

class Answer {
    public void removeEvenNumbers(Integer[] arr) {
        List<Integer> oddNumbersList = new ArrayList<>();

        for (Integer num : arr) {
            if (num.intValue() % 2 != 0) {
                oddNumbersList.add(num);
            }
        }

        System.out.println(java.util.Arrays.toString(oddNumbersList.toArray()));
    }
}




