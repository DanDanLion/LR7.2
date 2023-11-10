import java.util.Date;
public class BCards {
    private String tipe;
    private String Num;
    private Date date;
    private String cvv2;
    private String pin;

    private static int Count = 0;

    public String getTipe() {
        return tipe;
    }

    public String getNum() {
        return Num;
    }

    public Date getDate() {
        return date;
    }

    public String getCvv2() {
        return cvv2;
    }

    public String getPin() {
        return pin;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setNum(String num) {
        Num = num;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public BCards(String t, String n, Date d, String c, String p) {
        tipe = t;
        Num = n;
        date = d;
        cvv2 = c;
        pin = p;
        Count++;
    }
    public BCards() {
        tipe = "MasterCard";
        Num = "0000000000000000";
        date = new Date();
        cvv2 = "000";
        pin = "0000";
        Count++;
    }

    public static int getCount() {
        return Count;
    }

    public String toString(){
        return "Номер карти: " + Num + "\nПридатна до: "
                + date.getMonth()+"/"+(date.getYear()%100)+"\nТип картки: "+ tipe;
    }
}
