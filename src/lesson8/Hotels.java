package lesson8;

import java.util.Objects;

public class Hotels {
    private Hotel[] hotels = new Hotel[1000000];

    public void addHotel(Hotel hotel) {
        for (int i = 0; i < hotels.length; i++) {
            if (hotels[i] == null) {
                hotels[i] = hotel;
                break;
            }
        }
    }

    public void printHotelObject(int hotelId) {
        boolean foundFlag = false;
        for (Hotel hotel : this.hotels) {
            if (hotel != null) {
                if (hotel.getHotelId() == hotelId) {
                    System.out.println(hotel.toString());
                    foundFlag = true;
                }
            }
        }
        if (!foundFlag) {
            System.out.println("Not Found");
        }
    }

    public Hotel[] getHotels() {
        return hotels;
    }

    public void setHotels(Hotel[] hotels) {
        this.hotels = hotels;
    }

    public static class Hotel {
        private static int hotelCounter;
        private int hotelId;
        private String hotelName;
        private int foodId;
        private int stars;

        public Hotel(String hotelName, int foodId, int star) {
            hotelCounter++;
            this.hotelId = hotelCounter;
            this.hotelName = hotelName;
            this.foodId = foodId;
            this.stars = star;
        }
        public int getHotelId() {
            return hotelId;
        }

        public void setHotelId(int hotelId) {
            this.hotelId = hotelId;
        }

        public int getHotelCounter() {
            return hotelCounter;
        }

        public void setHotelCounter(int hotelCounter) {
            this.hotelCounter = hotelCounter;
        }

        public String getHotelName() {
            return hotelName;
        }

        public void setHotelName(String hotelName) {
            this.hotelName = hotelName;
        }

        public int getFoodId() {
            return foodId;
        }

        public void setFoodId(int foodId) {
            this.foodId = foodId;
        }

        public int getStars() {
            return stars;
        }

        public void setStars(int stars) {
            this.stars = stars;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Hotel hotel = (Hotel) o;
            return hotelId == hotel.hotelId && hotelCounter == hotel.hotelCounter && foodId == hotel.foodId && stars == hotel.stars && Objects.equals(hotelName, hotel.hotelName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(hotelId, hotelCounter, hotelName, foodId, stars);
        }

        @Override
        public String toString() {
            return "Hotel{" +
                    "hotelId=" + hotelId +
                    ", hotelName='" + hotelName + '\'' +
                    ", foodId=" + foodId +
                    ", stars=" + stars +
                    '}';
        }
    }
}
