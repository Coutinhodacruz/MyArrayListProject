package algorithm;


public class HugeInteger {
    private int[] digits;

    public HugeInteger() {
        digits = new int[40];
    }

    public void parse(String number) {
        if (number.length() > 40) {
            throw new IllegalArgumentException("Number exceeds 40 digits.");
        }

        clearDigits();

        int startIndex = 40 - number.length();
        for (int i = startIndex, j = 0; i < 40; i++, j++) {
            digits[i] = getNumericValue(number.charAt(j));
        }
    }

    private void clearDigits() {
        for (int i = 0; i < 40; i++) {
            digits[i] = 0;
        }
    }

    private int getNumericValue(char value) {
        return value - '0';
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int startIndex = 0;

        while (startIndex < 40 && digits[startIndex] == 0) {
            startIndex++;
        }

        if (startIndex == 40) {
            return "0";
        }

        for (int i = startIndex; i < 40; i++) {
            sb.append(digits[i]);
        }

        return sb.toString();
    }

    public void add(HugeInteger other) {
        int carry = 0;

        for (int i = 39; i >= 0; i--) {
            int sum = digits[i] + other.digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
    }

    public void subtract(HugeInteger other) {
        int borrow = 0;

        for (int i = 39; i >= 0; i--) {
            int diff = digits[i] - other.digits[i] - borrow;

            if (diff < 0) {
                digits[i] = diff + 10;
                borrow = 1;
            } else {
                digits[i] = diff;
                borrow = 0;
            }
        }
    }

    public boolean isEqualTo(HugeInteger other) {
        for (int i = 0; i < 40; i++) {
            if (digits[i] != other.digits[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isNotEqualTo(HugeInteger other) {
        return !isEqualTo(other);
    }

    public boolean isGreaterThan(HugeInteger other) {
        for (int i = 0; i < 40; i++) {
            if (digits[i] > other.digits[i]) {
                return true;
            } else if (digits[i] < other.digits[i]) {
                return false;
            }
        }
        return false;
    }

    public boolean isLessThan(HugeInteger other) {
        for (int i = 0; i < 40; i++) {
            if (digits[i] < other.digits[i]) {
                return true;
            } else if (digits[i] > other.digits[i]) {
                return false;
            }
        }
        return false;
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger other) {
        return !isLessThan(other);
    }

    public boolean isLessThanOrEqualTo(HugeInteger other) {
        return !isGreaterThan(other);
    }

    public boolean isZero() {
        for (int i = 0; i < 40; i++) {
            if (digits[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
