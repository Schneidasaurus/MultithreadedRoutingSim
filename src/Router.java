import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


/*
 * This runnable routes packets as they traverse the network.
 */
class Router implements Runnable {
    private LinkedList<Packet> list = new LinkedList<Packet>();
    private int routes[];
    private Router routers[];
    private int routerNum;
    private boolean end = false;
    Router(int rts[], Router rtrs[], int num) {
        routes = rts;
        routers = rtrs;
        routerNum = num;
    }
    /*
     * Add a packet to this router.  Add some details on how this works.
     */
    public void addWork(Packet p) {

    }
    /*
     * End the thread, once no more packets are outstanding.
     */
    public synchronized void end() {

    }

    public synchronized void networkEmpty() {
    }

    /*
     * Process packets.  Add some details on how this works.
     */
    public void run() {
    }
}