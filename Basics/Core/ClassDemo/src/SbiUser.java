public class SbiUser extends BankApp {

    public SbiUser( String name) {

        super( name );
        System.out.println("I am a constructor from new class");
    }

    @Override
    public void getUserInfo() {
        super.getUserInfo();
        System.out.println("Name of tax info is: " + taxDetail);

    }
}

class NewBank extends BankApp {

    public NewBank(String name) {
        super(name);
    }
}
