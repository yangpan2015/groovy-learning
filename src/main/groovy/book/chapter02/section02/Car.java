package book.chapter02.section02;

/**
 * @author Pan Yang
 * @since 2020/12/22 14:15
 */
public class Car {
    private int miles;
    private final int year;

    public Car(int year) {
        this.year = year;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "miles=" + miles +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        final Car car = new Car(2008);
        car.setMiles(1100);
        System.out.println(car);
    }
}
