class RunnableN extends Thread{
    public RunnableN(String name){
        super(name);
    }
    @Override
    public void run(){
        for(var i = 0;i < 100; i++){
            System.out.println(
                Thread.currentThread().getName() + "=" + i
            );
            try{
                Thread.sleep((int)(Math.random() * 100));
            }catch(InterruptedException e){}
        }
        System.out.println(Thread.currentThread().getName() + "到达终点");
    }
}

public class Test {
    public static void main(String[] args){
        Thread thread1 = new RunnableN("运动员 A");
        Thread thread2 = new RunnableN("运动员 B");
        thread1.start();
        thread2.start();
    }
}