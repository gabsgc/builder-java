public class HouseBuilder {
    private House house;

    public HouseBuilder() {
        house = new House();
    }

    public House build() {
        if (house.getBedroom() == 0) {
            throw new IllegalArgumentException("Insufficient number of bedrooms.");
        }
        if (house.getBathroom() == 0) {
            throw new IllegalArgumentException("Insufficient number of bathrooms.");
        }
        if (house.getKitchen() == 0) {
            throw new IllegalArgumentException("Insufficient number of kitchen.");
        }
        return house;
    }

    public HouseBuilder setLivingRoom(int livingRoom) {
        house.setLivingRoom(livingRoom);
        return this;
    }

    public HouseBuilder setBedroom(int bedroom) {
        house.setBedroom(bedroom);
        return this;
    }

    public HouseBuilder setBathroom(int bathroom) {
        house.setBathroom(bathroom);
        return this;
    }

    public HouseBuilder setKitchen(int kitchen) {
        house.setKitchen(kitchen);
        return this;
    }

    public HouseBuilder setGarden(boolean garden) {
        house.setGarden(garden);
        return this;
    }

    public HouseBuilder setGarage(boolean garage) {
        house.setGarage(garage);
        return this;
    }

    public HouseBuilder setSwimmingPool(boolean swimmingPool) {
        house.setSwimmingPool(swimmingPool);
        return this;
    }
}
