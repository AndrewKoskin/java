package Module2.Regexp.Regexp;

public class Homework4 {
    /**
     * 1) Создайте класс Client с полями: email, ip, address, url и конструктором со всеми полями
     * 2) Напишите класс ClientValidator с методами:
     * - boolean validateEmail(String email)
     * - boolean validateIP(String ip)
     * - boolean validateUrl(String url)
     * - boolean validateAddress(String address)
     * 3) boolean validateEmail(String email)
     * Общий вид валидного email — логин@поддомен.домен
     * Логин - слова из букв, цифр, подчеркиваний, дефисов и точек.
     * Поддомен - от 2 до 6 букв
     * Домен - один из: ru, com, net, org.
     * Примеры валидных: my_email@gmail.com  a.petrov@gmail.com coder-4575@yandex.ru
     * 4) boolean validateIP(String ip)
     * Всегда есть 4 группы цифр (от 1 до 3 цифр в каждой) разделены точками. Группа содержит число в диапазоне от 0 до 256
     * Примеры валидных: 127.0.0.0  , 255.255.255.255, 234.34.98.14
     * 5) boolean validateUrl(String url)
     * Сначала идет необязательный протокол (http:// или https://)
     * Затем последовательность букв, цифр, дефисов, подчеркиваний и точек (домены уровня > 1)
     * Потом домен первого уровня (от 2 до 6 букв)
     * И, наконец, файловая структура после слэша / — набор слов из букв, цифр, дефисов, подчеркиваний и точек со слэшем в конце или после знака ? набор букв, цифр, подчеркиваний, один знак равно =
     * В конце может быть слэш, а может отсутствовать
     * Примеры:
     * https://www.labirint.ru/books/594619/
     * https://catalog.onliner.by/bike?is_prime=1
     * /books/594619/  - эта часть может быть, а может отсутствовать
     * 6) boolean validateAddress(String address)
     * [Название страны] обл. [Название области] р-н [Название района] г. или д. [Название города или деревни] ул. [Название улицы] д. [Номер дома]
     * где все названия начинаются с большой буквы и состоят из кириллицы. Приставки обл.  г. - обязательны, номер дома - только цифры.
     * Метод должен сначала насколько возможно привести переданный адрес к валидному формату, убрав возможные лишние пробелы и спец. символы (%$@<>?*())
     * Затем проверить или строка соответствует формату.
     * 7) Создать класс ClientTest и в методе main создать несколько объектов класса Client. Протестировать работу всех методов для валидации.
     */
    public static void main(String[] args) {
        System.out.println(ClientValidator.validateEmail("meow@meow.com"));
        System.out.println(ClientValidator.validateIP("10.10.12.123"));
        System.out.println(ClientValidator.validateUrl("https://catalog.onliner.by/bike?is_prime=1"));
        System.out.println(ClientValidator.validateUrl("https://catalog.onliner.by/bike"));
    }
}

class Client {
    String email;
    String ip;
    String address;
    String url;

    public Client(String email, String ip, String address, String url) {
        this.email = email;
        this.ip = ip;
        this.address = address;
        this.url = url;
    }
}

class ClientValidator {
    public static boolean validateEmail(String email) {
        return email.matches("[a-z0-9-_.]+@[a-zA-z]{2,6}\\.(ru|com|net|org)");
    }

    public static boolean validateIP(String ip) {
        return ip.matches("^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$");
    }

    public static boolean validateUrl(String url) {
        return url.matches("(http:\\/\\/|https:\\/\\/)(www\\.)?([a-z\\-_]+\\.)*[a-z]{2,6}(\\/[a-z\\d]+)*\\/?([a-z]*\\?[a-z_\\d]*=[a-z_\\d])?");
    }

    boolean validateAddress(String address) {
        return true;
    }
}