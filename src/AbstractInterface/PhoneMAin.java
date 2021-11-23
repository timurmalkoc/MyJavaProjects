package AbstractInterface;

public class PhoneMAin {
    public static void main(String[] args) {
        ITelephone deskPhone = new DeskPhone(1234567);

        deskPhone.powerOn();
        deskPhone.callPhone(1234567);
        deskPhone.answer();
    }
}
