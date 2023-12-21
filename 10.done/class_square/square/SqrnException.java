package square;

public class CustomSqrnException extends ArithmeticException {
    public String additionalDetail;

    CustomSqrnException(String message) {
        this.additionalDetail = message;
    }

    @Override
    public String toString() {
        return "Discriminant is negative, no real roots! " + additionalDetail;
    }
}
