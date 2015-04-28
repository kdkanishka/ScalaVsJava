/**
 * Created by kanishka on 4/27/15.
 */
public class PrintThread extends Thread {
    Requester req;
    private int num;

    public PrintThread(Requester req,int i) {
        num = i;
        this.req = req;
    }

    @Override
    public void run() {
        synchronized (req) {
            print();
        }
    }

    private void print() {
        req.printMe(num+"");
    }

    public int getNum() {
        return num;
    }
}
