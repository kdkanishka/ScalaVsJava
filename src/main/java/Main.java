import java.util.ArrayList;
import java.util.List;

/**
 * Created by kanishka on 4/27/15.
 */
public class Main {
    public static void main(String[] args) {
        Requester req = new Requester();

        List<PrintThread> threadList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            PrintThread printThread = new PrintThread(req, i);
            printThread.start();
            threadList.add(printThread);
        }
        System.out.println("Here we go");
        while (!isAllDone(threadList)) {
            printStates(threadList);
        }

    }

    private static boolean isAllDone(List<PrintThread> threadList) {
        boolean isAlldone = true;
        for (PrintThread pt : threadList) {
            isAlldone = isAlldone && !pt.isAlive();
        }
        return isAlldone;
    }

    private static void printStates(List<PrintThread> threadList) {
        System.out.println("_________________________________________");
        for (PrintThread pt : threadList) {
//            if (pt.getState() == State.BLOCKED) {
//                System.out.print(pt.getState());
//                System.out.print(", ");
            System.out.println(pt.getNum() + ">" + pt.getState());

//            }
        }

        System.out.println("_________________________________________");

    }
}
