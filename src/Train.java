import java.time.LocalDate;

final class Train extends Transport {
    private double priceOfTrip;                 //  - Цена поездки
    private LocalDate travelTime;               // - Время поездки
    private String nameOfDepartureStation;      // - Название станции отбытия
    private String finalStop;                   // - Конечная остановка
    private int numberOfWagons;                 // - Количество вагонов

    static private final String errInfo = "Информация не указана";

    public Train(String brand, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed, double priceOfTrip, LocalDate travelTime, String nameOfDepartureStation, String finalStop, int numberOfWagons) {
        super(brand, model, yearOfRelease, countryOfManufacture, bodyColor, maximumMovementSpeed);
        this.priceOfTrip = priceOfTrip;
        this.travelTime = travelTime;
        this.nameOfDepartureStation = nameOfDepartureStation;
        this.finalStop = finalStop;
        this.numberOfWagons = numberOfWagons;
    }

    double getPriceOfTrip() {
        return priceOfTrip;
    }

    public void setPriceOfTrip(double priceOfTrip) {
        this.priceOfTrip = priceOfTrip;
    }

    LocalDate getTravelTime() {
        return travelTime;
    }

    void setTravelTime(LocalDate travelTime) {
        this.travelTime = travelTime;
    }

    String getNameOfDepartureStation() {
        return nameOfDepartureStation;
    }

    void setNameOfDepartureStation(String nameOfDepartureStation) {
        this.nameOfDepartureStation = (nameOfDepartureStation == null || nameOfDepartureStation.isBlank()) ? errInfo : nameOfDepartureStation;
    }

    String getFinalStop() {
        return finalStop;
    }

    void setFinalStop(String finalStop) {
        this.finalStop = (finalStop == null || finalStop.isBlank()) ? errInfo : finalStop;
    }

    int getNumberOfWagons() {
        return numberOfWagons;
    }

    void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public String toString() {
        return "Поезд " + getBrand() + " модель " + getModel()
                + ", год производства " + getYearOfRelease()
                + ", страна сборки " + getCountryOfManufacture()
                + ", скорость передвижения " + getMaximumMovementSpeed()
                + ", отходит от  " + getNameOfDepartureStation()
                + ", и следует до станции " + getFinalStop()
                + ", цена поездки " + getPriceOfTrip()
                + ", в поезде " + getNumberOfWagons() + " вагонов.";
    }

    @Override
    String refill() {
        return "нужно заправлять дизелем";
    }
}
