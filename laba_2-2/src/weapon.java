public class weapon {
    private String SerialNumber;
    private String ProducerCountry;
    private boolean inService;

    public void setSerialNumber(String number) {
        SerialNumber = number;
    }

    public void setProducerCountry(String country) {
        ProducerCountry = country;
    }

    public void setInService(boolean s) {
        inService = s;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public String getProducerCountry() {
        return ProducerCountry;
    }

    public boolean getInService() {
        return inService;
    }

    public weapon() {
        SerialNumber = "Нет номера";
        ProducerCountry = "Нет производителя";
        inService = false;
    }

    public weapon(String number, String country, boolean s){
        SerialNumber = number;
        ProducerCountry = country;
        inService = s;
    }

}
