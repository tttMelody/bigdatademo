package multhread;

/**
 * Created with IntelliJ IDEA.
 * User: sssd
 * Date: 2017/12/6 13:54
 * Version: V1.0
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Runnable5 implements Runnable {

    public String path = "DES\\src\\main\\resources\\destest\\init\\t5.txt";
    public String savaPath = "DES\\src\\main\\resources\\destest";

    @Override
    public void run() {
        FileHandle.fileHandle(path, savaPath);
    }

    public static void main(String[] args) {
        Runnable5 runnable1 = new Runnable5();
        runnable1.run();
    }

}
