import java.util.Objects;

public class Payment {
    private String fio;
    private int day,month, year;
    private int sumPayment;

    public Payment(String fio, int day, int month, int year, int sumPayment) {
        this.fio = fio;
        this.day = day;
        this.month = month;
        this.year = year;
        this.sumPayment = sumPayment;
    }

    public Payment(Payment payment){
        this.fio=payment.getFio();
        this.day=payment.day;
        this.month=payment.month;
        this.year=payment.year;
        this.sumPayment=payment.sumPayment;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSumPayment() {
        return sumPayment;
    }

    public void setSumPayment(int sumPayment) {
        this.sumPayment = sumPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return day == payment.day &&
                month == payment.month &&
                year == payment.year &&
                sumPayment == payment.sumPayment &&
                Objects.equals(fio, payment.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, day, month, year, sumPayment);
    }

    @Override
    public String toString() {
        return "Плательщик: " +
                fio +
                ", дата: " + day + "." + month + "." + year +
                " сумма: " + sumPayment/100 + " руб. " + sumPayment % 100 + " коп."
                ;
    }
}
