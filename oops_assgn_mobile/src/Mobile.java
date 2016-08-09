//this is for a specific mobile and it extends the basic feature of mobile and also implements the necessary functions
public  class Mobile extends BaseMobile implements IMobile,SIMobile{
    boolean power;
    String sender;
    String contactlist[];


    public Mobile() {
        this.power=false;
        this.modelNo=1100;
        this.size=4.7;
        this.weight=56.4;
        this.os=new String("Symbian");
        this.sender=new String("Deep");
        this.contactlist= new String[]{"Ajay","Akshay","Vivek"};
    }


    public void call(String receiver) {

        System.out.println("Calling to " + receiver);


    }

    public void answer(String receiver) {


        System.out.println(receiver + " calling");


    }


    public void sendSms(String receiver) {

        System.out.println("Message sent successfully from " + sender + " to " + receiver);


    }




}

