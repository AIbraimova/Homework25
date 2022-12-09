public class CarInfo {
    private int year;
    private String model;
    private double price;
    private String color;

    public CarInfo(int year, String model, double price, String color) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nCarInfo" +
                "\n-------------------" +
                "\nyear=" + year +
                "\nmodel='" + model + '\'' +
                "\nprice=" + price +
                "\ncolor='" + color + '\n' +
                "\n -------------------------------";
    }
}