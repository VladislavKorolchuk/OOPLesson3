final class Bus extends Transport {

    public Bus(String brand, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed) {
        super(brand, model, yearOfRelease, countryOfManufacture, bodyColor, maximumMovementSpeed);
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel()
                + ", цвет кузова  " + getBodyColor()
                + ", год производства " + getYearOfRelease()
                + ", страна сборки " + getCountryOfManufacture()
                + ", максимальная скорость " + getMaximumMovementSpeed();
    }

    @Override
    String refill() {
        return "можно заправлять бензином или дизелем на заправке";
    }
}
