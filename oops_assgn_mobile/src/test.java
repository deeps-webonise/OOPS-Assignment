public class test{
    public static void main(String args[])
    {

        Mobile mobile = new Mobile();
        mobile.on();
        mobile.call("Ajay");
        mobile.sendSms("Akshay");
        mobile.answer("Vivek");
        mobile.off();


    }
}