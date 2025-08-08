
class UnderAgeException extends RuntimeException {
    public UnderAgeException(String message) {
        super(message);
    }
}

class VotingEligibility {
    public static void checkEligibility(int age) {
        if (age < 18) {
            throw new UnderAgeException("You are underage for voting.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        int age = 16;

        try {
            checkEligibility(age);
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
