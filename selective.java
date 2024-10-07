import java.util.Scanner;

class Selective{

    public static void send(int frame, int nack){
        System.out.println("frame " + frame + " sent !!!");
        receive(frame, nack);
    }

    public static void receive(int frame, int nack){
        if (frame != nack){
        System.out.println("frame " + frame + " recieved !!!\n");
        }
        else{
            System.out.println("frame " + frame + " not recieved !!!\n");
        }
    }

    public static void resend(int frame){
        System.out.println("frame " + frame + " resend !!!");
        receive(frame, 0);
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);


        System.out.println("enter the no. of frames you want to send:\t");
        int frames = obj.nextInt();
        
        System.out.println("enter the frame for which you want to send a NACK:\t");
        int nack = obj.nextInt();
        
        for(int frame = 0; frame<frames; frame++){
            send(frame, nack);
        }
            resend(nack);
    

    }
}