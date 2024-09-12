
public class Pong {

    public static void main(String[] args){
        pong = new Pong();
        new Thread(pong).start();
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(1000/60);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(gameStatus == 2) {
                update();
            }
        }
    }
}
