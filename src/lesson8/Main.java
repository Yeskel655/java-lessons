package lesson8;

public class Main {
    public static void main(String[] args) {

        String[] foodNames = {"Breakfast", "Lanch", "Dinner", "Full"};
        String[] hotelNames = {"Prada", "Lui", "Spa", "Hamam", "Swim", "Research", "Beach"};
        String[] countriesNames = {"Russia", "Indonesia", "Thailand", "China", "Turkey"};
        String[] transportNames = {"Plane", "Bus", "Train", "Ship"};
        Foods foods = new Foods();
        Hotels hotels = new Hotels();
        Countries countries = new Countries();
        Transports transports = new Transports();
        for (String foodName : foodNames) {
            foods.addFood(new Foods.Food(foodName));
        }
        for (int i = 0; i < hotelNames.length; i++) {
            for (int j = 0; j < foods.getFoods().length; j++) {
                if (foods.getFoods()[j] != null) {
                    hotels.addHotel(new Hotels.Hotel(hotelNames[i], foods.getFoods()[j].getFoodId(), rnd(1, 5)));
                }
            }
        }
        for (String countryName : countriesNames) {
            countries.addCountry(new Countries.Country(countryName));
        }
        for (String transportName : transportNames) {
            transports.addTransport(new Transports.Transport(transportName));
        }
        Tours tours = new Tours();
        tours.setCountries(countries);
        tours.setFoods(foods);
        tours.setTransports(transports);
        tours.setHotels(hotels);
        for (int i = 0; i < 100; i++) {
            tours.addTour(new Tours.Tour(rnd(1, countriesNames.length), rnd(1, hotelNames.length), rnd(50000, 900000), rnd(1, transportNames.length), rnd(1, foodNames.length)));
        }
        tours.searchByCountry();
        tours.searchByTransport();
        tours.searchByStars();
        tours.searchByMoneyDiapazon();
        tours.searchByMoneyNotMore();
        tours.searchByMoneyExpensive();

    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
