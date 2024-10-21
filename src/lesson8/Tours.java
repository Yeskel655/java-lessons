package lesson8;

import java.util.Scanner;

public class Tours {
    private Tour[] tours = new Tour[1000000];
    private Countries countries;
    private Hotels hotels;
    private Transports transports;
    private Foods foods;

    public Countries getCountries() {
        return countries;
    }

    public void setCountries(Countries countries) {
        this.countries = countries;
    }

    public Hotels getHotels() {
        return hotels;
    }

    public void setHotels(Hotels hotels) {
        this.hotels = hotels;
    }

    public Transports getTransports() {
        return transports;
    }

    public void setTransports(Transports transports) {
        this.transports = transports;
    }

    public Foods getFoods() {
        return foods;
    }

    public void setFoods(Foods foods) {
        this.foods = foods;
    }

    public void addTour(Tour tour) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i] == null) {
                tours[i] = tour;
                break;
            }
        }
    }

    public void searchByCountry() {
        System.out.println("Выберете страну в которую хотите поехать:");
        countries.printAllCountries();
        Scanner scanner = new Scanner(System.in);
        int countryId = scanner.nextInt();
        for (Tour tour : tours) {
            if (tour != null && tour.getCountryId() == countryId) {
                this.printTour(tour);
            }
        }
    }

    public void searchByTransport() {
        System.out.println("Выберете тип транспорта:");
        transports.printAllTransports();
        Scanner scanner = new Scanner(System.in);
        int transportId = scanner.nextInt();
        for (Tour tour : tours) {
            if (tour != null && tour.getTransportId() == transportId) {
                this.printTour(tour);
            }
        }
    }

    public void searchByStars() {
        System.out.println("Укажите количество от какого количества звёзд:");
        System.out.println("1 - *");
        System.out.println("2 - **");
        System.out.println("3 - ***");
        System.out.println("4 - ****");
        System.out.println("5 - *****");
        Scanner scanner = new Scanner(System.in);
        int stars = scanner.nextInt();
        int hotelId = 0;
        for (Hotels.Hotel hotel : this.getHotels().getHotels()) {
            if (hotel != null && hotel.getStars() == stars) {
                hotelId = hotel.getHotelId();
                break;
            }
        }
        for (Tour tour : tours) {
            if (tour != null && tour.getHotelId() == hotelId) {
                this.printTour(tour);
            }
        }
    }

    public void searchByMoneyDiapazon() {
        System.out.println("Укажите минимальную стоимость тура:");
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        System.out.println("Укажите максимальную стоимость тура:");
        int max = scanner.nextInt();
        for (Tour tour : tours) {
            if (tour != null && tour.getPrice() <= max && tour.getPrice() >= min) {
                this.printTour(tour);
            }
        }
    }

    public void searchByMoneyNotMore() {
        System.out.println("Укажите максимальную стоимость тура:");
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        for (Tour tour : tours) {
            if (tour != null && tour.getPrice() <= max) {
                this.printTour(tour);
            }
        }
    }

    public void searchByMoneyExpensive() {
        int maxPrice = 0;
        Tours.Tour tourWithMaxPrice = null;
        for (Tour tour : tours) {
            if (tour != null && tour.getPrice() >= maxPrice) {
                maxPrice = tour.getPrice();
                tourWithMaxPrice = tour;
            }
        }
        if (tourWithMaxPrice != null) {
            this.printTour(tourWithMaxPrice);
        }
    }

    public void printTour(Tour tour) {
        System.out.println("__________________");
        System.out.println("Country:");
        this.getCountries().printCountryObjectById(tour.getCountryId());
        System.out.println("Transport:");
        this.getTransports().printTransportObject(tour.getTransportId());
        System.out.println("Hotel:");
        this.getHotels().printHotelObject(tour.getHotelId());
        System.out.println("Food:");
        this.getFoods().printFoodObject(tour.getFoodId());
        System.out.println("-----Price-----");
        System.out.println(tour.getPrice());
        System.out.println("__________________");
    }

    public static class Tour {
        private int tourId;
        private static int tourCounter;
        private int countryId;
        private int hotelId;
        private int price;
        private int transportId;
        private int foodId;

        public Tour(int countryId, int hotelId, int price, int transportId, int foodId) {
            tourCounter++;
            this.tourId = tourCounter;
            this.countryId = countryId;
            this.hotelId = hotelId;
            this.price = price;
            this.transportId = transportId;
            this.foodId = foodId;
        }

        public int getTourId() {
            return tourId;
        }

        public void setTourId(int tourId) {
            this.tourId = tourId;
        }

        public static int getTourCounter() {
            return tourCounter;
        }

        public static void setTourCounter(int tourCounter) {
            Tour.tourCounter = tourCounter;
        }

        public int getCountryId() {
            return countryId;
        }

        public void setCountryId(int countryId) {
            this.countryId = countryId;
        }

        public int getHotelId() {
            return hotelId;
        }

        public void setHotelId(int hotelId) {
            this.hotelId = hotelId;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getTransportId() {
            return transportId;
        }

        public void setTransportId(int transportId) {
            this.transportId = transportId;
        }

        public int getFoodId() {
            return foodId;
        }

        public void setFoodId(int foodId) {
            this.foodId = foodId;
        }

        @Override
        public String toString() {
            return "Tour{" +
                    "tourId=" + tourId +
                    ", countryId=" + countryId +
                    ", hotelId=" + hotelId +
                    ", price=" + price +
                    ", transportId=" + transportId +
                    '}';
        }
    }
}
