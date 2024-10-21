package lesson8;

public class Transports {
    private Transport[] transports = new Transport[1000000];

    public void addTransport(Transport transport) {
        for (int i = 0; i < transports.length; i++) {
            if (transports[i] == null) {
                transports[i] = transport;
                break;
            }
        }
    }

    public void printTransportObject(int transportId) {
        boolean foundFlag = false;
        for (Transport transport : this.transports) {
            if (transport != null) {
                if (transport.getTransportId() == transportId) {
                    System.out.println(transport.toString());
                    foundFlag = true;
                    break;
                }
            }
        }
        if (!foundFlag) {
            System.out.println("Not Found");
        }
    }

    public void printAllTransports(){
        for (Transports.Transport transport : transports){
            if(transport != null){
                System.out.println(transport.getTransportId() + "-" + transport.getTransportName());
            }
        }
    }

    public Transport[] getTransports() {
        return transports;
    }

    public void setTransports(Transport[] transports) {
        this.transports = transports;
    }

    public static class Transport {
        private int transportId;
        private static int trasportCounter;
        private String transportName;

        public Transport(String transportName) {
            trasportCounter++;
            this.transportId = trasportCounter;
            this.transportName = transportName;
        }

        public int getTransportId() {
            return transportId;
        }

        public void setTransportId(int transportId) {
            this.transportId = transportId;
        }

        public int getTrasportCounter() {
            return trasportCounter;
        }

        public void setTrasportCounter(int trasportCounter) {
            this.trasportCounter = trasportCounter;
        }

        public String getTransportName() {
            return transportName;
        }

        public void setTransportName(String transportName) {
            this.transportName = transportName;
        }

        @Override
        public String toString() {
            return "Transport{" +
                    "transportId=" + transportId +
                    ", transportName='" + transportName + '\'' +
                    '}';
        }
    }
}
