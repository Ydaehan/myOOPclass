public class TelevisionTest {
    public static void main(String[] args) {
        // 수업 중에 한 것 
        // Television myTV = new Television();

        // myTV.channel = 7;
        // myTV.volume = 9;
        // myTV.isOn = true;
        // myTV.print();

        // Television yourTv = new Television();
        // yourTv.channel = 9;
        // yourTv.volume = 12;
        // yourTv.isOn = true;
        // yourTv.print();

        Television myTv = new Television();
        myTv.setChannel(11);
        int ch = myTv.getChannel();
        System.out.println("현재 채널은 " + ch + "입니다.");
        
    }
}
