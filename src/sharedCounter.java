import sun.plugin.dom.css.Counter;

/**
 * Created by Jakob on 13-10-2016.
 */
public class sharedCounter extends Counterthread {

    public static void main(String[] args) {

        sharedCounter();


    }

    public static void sharedCounter(){

        Counterthread[] ct = new Counterthread[10];

        for (int i = 0; i <10; i++){
            ct[i] = new Counterthread();
            ct[i].start();
        }

        System.out.println(counter);
    }

}

class Counterthread extends Thread{

    public static int counter;

    public Counterthread(){

    }

    public Counterthread(int counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for (int i = 0; i<10; i++){
            counter++;
        }
    }

}
