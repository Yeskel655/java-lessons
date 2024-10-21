package lesson8;

public class Countries {
    private Country[] countries = new Country[1000000];

    public void addCountry(Country country) {
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] == null) {
                countries[i] = country;
                break;
            }
        }
    }

    public void printCountryObjectById(int countryId) {
        boolean foundFlag = false;
        for (Country country : this.countries) {
            if (country != null) {
                if (country.getCountryId() == countryId) {
                    System.out.println(country.toString());
                    foundFlag = true;
                    break;
                }
            }
        }
        if (!foundFlag) {
            System.out.println("Not Found");
        }
    }

    public void printAllCountries(){
        for (Country country : countries){
            if(country != null){
                System.out.println(country.getCountryId() + "-" + country.getCountryName());
            }
        }
    }

    public Country[] getCountries() {
        return countries;
    }

    public void setCountries(Country[] countries) {
        this.countries = countries;
    }

    public static class Country {
        private int countryId;
        private static int countryCounter;
        private String countryName;

        public Country(String countryName) {
            countryCounter++;
            this.countryId = countryCounter;
            this.countryName = countryName;
        }

        public int getCountryId() {
            return countryId;
        }

        public void setCountryId(int countryId) {
            this.countryId = countryId;
        }

        public int getCountryCounter() {
            return countryCounter;
        }

        public void setCountryCounter(int countryCounter) {
            this.countryCounter = countryCounter;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        @Override
        public String toString() {
            return "Country{" +
                    "countryId=" + countryId +
                    ", countryName='" + countryName + '\'' +
                    '}';
        }
    }
}
