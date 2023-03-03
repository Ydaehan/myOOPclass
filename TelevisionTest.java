public class TelevisionTest {
    public static void main(String[] args) {
        Television myTV = new Television();

        myTV.channel = 7;
        myTV.volume = 9;
        myTV.isOn = true;
        myTV.print();

        Television yourTv = new Television();
        yourTv.channel = 9;
        yourTv.volume = 12;
        yourTv.isOn = true;
        yourTv.print();
    }
}
