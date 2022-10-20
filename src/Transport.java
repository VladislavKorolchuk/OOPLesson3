abstract class Transport {
    private String brand;                        // - Марка
    private String model;                       // - Модель
    private final int yearOfRelease;            //- Год выпуска
    private final String countryOfManufacture;  //- Страна производства
    private String bodyColor;                   // - Цвет кузова
    private int MaximumMovementSpeed;           //- Максимальная скорость передвижения

    static private final String errInfo = "Информация не указана";


    Transport(String brand, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed) {
        setBrand(brand);
        setModel(model);
        this.yearOfRelease = yearOfRelease;
        this.countryOfManufacture = (countryOfManufacture == null || countryOfManufacture.isBlank()) ? errInfo : countryOfManufacture;
        setBodyColor(bodyColor);
        setMaximumMovementSpeed(maximumMovementSpeed);
    }

    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = (brand == null || brand.isBlank()) ? errInfo : brand;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = (model == null || model.isBlank()) ? errInfo : model;
    }

    int getYearOfRelease() {
        return yearOfRelease;
    }

    String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    String getBodyColor() {
        return bodyColor;
    }

    void setBodyColor(String bodyColor) {
        this.bodyColor = (bodyColor == null || bodyColor.isBlank()) ? errInfo : bodyColor;
    }

    int getMaximumMovementSpeed() {
        return MaximumMovementSpeed;
    }

    void setMaximumMovementSpeed(int maximumMovementSpeed) {
        this.MaximumMovementSpeed = maximumMovementSpeed;
    }

    abstract String refill();

}
