// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
public class Main {
    public class BankCard {
        private String cardType;
        private String cardNumber;
        private String expirationDate;
        private String cvv2;
        private String pin;

        private static int numberOfCards = 0;

        public BankCard() {
            numberOfCards++;
        }

        public BankCard(String cardType, String cardNumber, String expirationDate, String cvv2, String pin) {
            this.cardType = cardType;
            this.cardNumber = cardNumber;
            this.expirationDate = expirationDate;
            this.cvv2 = cvv2;
            this.pin = pin;
            numberOfCards++;
        }

        public static int getNumberOfCards() {
            return numberOfCards;
        }
        public String toString() {
            return "Номер картки: " + cardNumber.substring(0, 4) + " " + cardNumber.substring(4, 8) + " " +
                    cardNumber.substring(8, 12) + " " + cardNumber.substring(12) + "\n" +
                    "Придатна до: " + expirationDate.substring(0, 2) + "/" + expirationDate.substring(2) + "\n" +
                    "Тип картки: " + cardType;
        }
    }


    public class BankCustomer {
        private String fullName;
        private String birthdate;
        private BankCard[] cards;

        public BankCustomer() {
            this.cards = new BankCard[0];
        }

        public BankCustomer(String fullName, String birthdate, int numberOfCards) {
            this.fullName = fullName;
            this.birthdate = birthdate;
            this.cards = new BankCard[numberOfCards];
        }

        public BankCustomer(BankCustomer other) {
            this.fullName = other.fullName;
            this.birthdate = other.birthdate;
            this.cards = Arrays.copyOf(other.cards, other.cards.length);
        }

        public void addCard(BankCard card) {
            for (int i = 0; i < cards.length; i++) {
                if (cards[i] == null) {
                    cards[i] = card;
                    break;
                }
            }
        }

        public void makePurchase(String cardNumber, double amount, String pin) {
            if (cardNumber.length() == 16) {
                System.out.println("Витрачено " + amount + " грн з картки " + cardNumber);
            } else {
                System.out.println("Помилковий номер картки");
            }
        }

        public void makeOnlinePurchase(String cardNumber, double amount, String cvv2) {
            if (cvv2 != null && !cvv2.isEmpty()) {
                System.out.println("Витрачено " + amount + " грн в інтернет-магазині з картки " + cardNumber);
            } else {
                System.out.println("Неправильний CVV2-код");
            }
        }
    }

    public static void main(String[] args) {
        Main mainInstance = new Main();
        BankCustomer customer = mainInstance.new BankCustomer();
        customer.makePurchase("1234567890123456", 50.0, "1111");
        customer.makeOnlinePurchase("9876543210987654", 30.0, "456");
    }
}