import java.util.Scanner;

class goBackN{

    static ArrayList<int> frames = new ArrayList<int>();

    public static void send(int frame){
        for (frame; frame>=0; frame--){
            receive(frame);
        }
    }

    public static void receive(int frame){
        
        frames.add(frame);
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("enter the no. of frames you want to send:\t");
        int frames = obj.nextInt();
        // System.out.println(frames);
        obj.
        send();

        

    }
}