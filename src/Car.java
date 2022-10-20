final class Car extends Transport {


    private double engineCapacity;       // объем двигателя в литрах
    private String transmission;         // коробка передач
    private final String bodyType;       // тип кузова
    private String registrationNumber;   // регистрационный номер
    private final int numberOfSeats;     // количество мест
    private boolean rubber;              // признак летняя или зимняя резина


    public Car(String brand, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed, double engineCapacity, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean rubber) {
        super(brand, model, yearOfRelease, countryOfManufacture, bodyColor, maximumMovementSpeed);
        this.engineCapacity = engineCapacity;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.rubber = rubber;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isRubber() {
        return rubber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel()
                + ", объем двигателя в литрах " + getEngineCapacity()
                + ", цвет кузова  " + getBodyColor()
                + ", год производства " + getYearOfRelease()
                + ", страна сборки " + getCountryOfManufacture()
                + ", коробка передач " + getTransmission()
                + ", тип кузова " + getBodyType()
                + ", регистрационный номер " + getRegistrationNumber()
                + ", количество мест " + getNumberOfSeats()
                + ", резина " + (isRubber() ? "летняя" : "зимня");
    }

    @Override
    String refill() {
        return "можно заправлять бензином, дизелем на заправке или заряжать на специальных электроду-парковках, если это электрокар";
    }
}
