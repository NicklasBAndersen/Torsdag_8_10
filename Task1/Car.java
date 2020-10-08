package Task1;

public class Car {

    private String make;
    private char model;
    private int year;
    private String bodyStyle;
    private String driver;

    public Car(String make, char model, int year, String bodyStyle){

        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;

    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String toString(){
        return "Make: "+make+". Model: "+model+ " ("+ year + "), BodyStyle: "+bodyStyle;
    }

}
