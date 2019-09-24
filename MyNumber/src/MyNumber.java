public class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getLastDigit() {
        if (this.number < 0) {
            return -this.number % 10;
        } else
            return this.number % 10;
    }

    public int getFirstDigit() {
        int num = this.number;
        while (num > 10) {
            num /= 10;
        }
        return num;
    }

    public boolean isDivisibleBy(int other) {
        if (this.number % other == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int numberOfProperDivisors() {
        int sum = 0;
        for (int i = 1; i < this.number; i++) {
            if (isDivisibleBy(i)) {
                sum++;
            }
        }
        return sum;
    }

    public boolean isPrime() {
        if (numberOfProperDivisors() == 1 && this.number != 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (isPrime()) {
            return this.number + "  (a prime Number)";
        } else {
            return String.valueOf(this.number);
        }
    }

    public MyNumber plus(MyNumber anotherNumber) {
        if (anotherNumber != null) {
            return new MyNumber(this.number + anotherNumber.getNumber());
        } else {
            return new MyNumber(this.number);
        }
    }

    public boolean isPerfectNumber() {
        int sum = 0;
        for (int i = 1; i < this.number; i++) {
            if (isDivisibleBy(i)) {
                sum += i;
            }
        }
        return sum == this.number;
    }

}
