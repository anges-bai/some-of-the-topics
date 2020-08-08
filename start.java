Public class MyRunnable implements Runnable{

      Public void run(){

for(int i = 0;i<10000;i++){

System.out.println("aaaaaaaaaaaaa");

}

}

Public class TestDemo{

Public static void main（String[] args）{

      MyRunnable mr = new MyRunnable();

      Thread t = new Thread(mr);

      T.start();//线程启动

}

}
