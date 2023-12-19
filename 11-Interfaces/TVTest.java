public class TVTest {
    public static void main(String[] args) {
        TV t = new TV();
        t.on();
        t.status();
        t.setChannel(15);
        //t.setChannel(142);
        t.volumeUp();
        t.volumeUp();
        t.volumeUp();
        t.volumeUp();
        t.volumeUp();
        t.volumeUp();
        t.status();
        //t.channelDown();
        //t.status();
        t.off();
        t.status();
    }
}
