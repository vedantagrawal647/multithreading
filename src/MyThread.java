//Create a thread which print 10 after printing 5 th
public class MyThread extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++) {
            try{
                if (i != 6) {
                    System.out.println(i);
                }
                else
                {
                    Thread.sleep(5000);
                    System.out.println(i);
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
 class Main
 {
     public static void main(String[] args) {
         MyThread obj=new MyThread();
         obj.start();
     }
 }
