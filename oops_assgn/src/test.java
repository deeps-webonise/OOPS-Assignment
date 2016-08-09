public class test {
    public static void main(String[] args) {
       //The interface stores the television object as reference
        ITV tv=new Television();

        ITV rtv=new Television();

        tv.on();

        tv.decreaseVolume();

        tv.setChannel(25);

        tv.increaseVolume();

        tv.off();

        System.out.println("---------------------------");


        rtv.on();

        rtv.decreaseVolume();

        rtv.setChannel(25);

        rtv.increaseVolume();

        rtv.off();





    }
}
