import java.util.stream.IntStream;

class FizzBuzz {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).forEach(FizzBuzz::getFizzBuzzOf);
    }

    static void getFizzBuzzOf(int i) {
        String value;

        boolean multipleOf3 = i % 3 == 0;
        boolean multipleOf5 = i % 5 == 0;

        if (multipleOf3 && multipleOf5) {
            value = "FizzBuzz";
        } else if (multipleOf3) {
            value = "Fizz";
        } else if (multipleOf5) {
            value = "Buzz";
        } else {
            value = i + "";
        }

        System.out.println(value);
    }
}