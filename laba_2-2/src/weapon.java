/**
 * Класс Оружие -базовый класс для объектов транспорта
 * @since 1.0
 * @version release
 * @author Климшин В.И.*/
public class weapon {
    /**Поле для хранения Серийного номера */
    private String SerialNumber;
    /**Поле для хранения Страны-произодителя */
    private String ProducerCountry;
    private boolean inService;

    /**
     *  Устанавливает значение поля {@link weapon#SerialNumber}
     *  @param number -серийный номер оружия */
    public void setSerialNumber(String number) {
        SerialNumber = number;
    }

    public void setProducerCountry(String country) {
        ProducerCountry = country;
    }

    public void setInService(boolean s) {
        inService = s;
    }

    /**
     *  Возвращает значение поля {@link weapon#SerialNumber}
     *  @return  строка-серийный номер оружия */
    public String getSerialNumber() {
        return SerialNumber;
    }

    public String getProducerCountry() {
        return ProducerCountry;
    }

    public boolean getInService() {
        return inService;
    }
    /**
     *  Создание нового объекта
     *  @see weapon#weapon(String, String, boolean) */
    public weapon() {
        SerialNumber = "Нет номера";
        ProducerCountry = "Нет производителя";
        inService = false;
    }
    /** * Создает оружие с задаными значениями серийного номера, страны-производителя и нахождения на вооружении
     *  @param number -серийный номер
     *  @param country - страна-производитель
     *  @param s -находится ли на вооружении
     *  @see weapon#weapon() */
    public weapon(String number, String country, boolean s) {
        SerialNumber = number;
        ProducerCountry = country;
        inService = s;
    }

}
