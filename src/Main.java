import java.util.Date;

public class Main {
  public static void main(String[] args){
    BCards met1 = new BCards("Mastercard", "6732456321457321", new Date(2033,1,1), "228","1234");
    BCards met2 = new BCards("Visa", "3987428988787777", new Date(2033,1,1), "228","1234");
    BCards met3 = new BCards("НеКарта,но карта", "5167985520230178", new Date(2033,1,1), "228","1234");
    BCards met4 = new BCards("Artem", "6666666666666666", new Date(2033,1,1), "228","1234");
    System.out.println(met1.toString());
    System.out.println("Кількість карток: "+BCards.getCount());
  }
}

