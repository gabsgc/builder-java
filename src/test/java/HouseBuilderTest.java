import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseBuilderTest {

    @Test
    void shoudThrowExceptionToHouseWithoutBedroom() {
        try {
            HouseBuilder houseBuilder = new HouseBuilder();
            House house = houseBuilder
                    .setBathroom(1)
                    .setKitchen(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Insufficient number of bedrooms.", e.getMessage());
        }
    }

    @Test
    void shouldThrowExceptionToHouseWithoutBathroom() {
        try {
            HouseBuilder houseBuilder = new HouseBuilder();
            House house = houseBuilder
                    .setBedroom(1)
                    .setKitchen(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Insufficient number of bathrooms.", e.getMessage());
        }
    }

    @Test
    void shouldThrowExceptionToHouseWithoutKitchen() {
        try {
            HouseBuilder houseBuilder = new HouseBuilder();
            House house = houseBuilder
                    .setBedroom(1)
                    .setBathroom(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Insufficient number of kitchen.", e.getMessage());
        }
    }

    @Test
    void shouldReturnValidHouse() {
        HouseBuilder houseBuilder = new HouseBuilder();
        House house = houseBuilder
                .setBedroom(1)
                .setBathroom(1)
                .setKitchen(1)
                .setLivingRoom(1)
                .setGarage(true)
                .setGarden(false)
                .setSwimmingPool(false)
                .build();
        assertNotNull(house);
    }
}