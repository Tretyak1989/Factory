/**
 * Created by Андрей on 04.12.2016.
 */
public class Test {
    public static void main(String[] args) {

        IMobilePhone phone = new Samsung();
        phone.showMobilePhone();

        IMobilePhone phone1 = new IPhone();
        phone1.showMobilePhone();
    }
}
