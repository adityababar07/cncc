#include <stdio.h>

int windowSize,sent=0,ack,i;


int main(){

for (i=0, i<=6, i++){
        pop(i);
        push(i);      
    }

}

int push(int i)
{
  reciever_frames.push(i); 
    
}

int pop(int i){
    sender_frames.pop(i);
}
