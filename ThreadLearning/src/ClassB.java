public class ClassB extends Thread{
    public void run(){
        for(int i = 0; i < 100 ;i++){
            System.out.println("Nothing."+i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
