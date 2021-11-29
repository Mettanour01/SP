public class Main {

    public static void main(String[] args){

        Evolution egg = (new Evolution(" Один говорит, яйцо"));
        Evolution chicken = (new Evolution("Другой, курица"));

        try {
            egg.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(" Остановочка");
        System.out.print("Первым появилось ");
        if (chicken.thread.isAlive()){
            System.out.print("Курочка");
        }else{

            System.out.print("Яичко");
        }
    }

}