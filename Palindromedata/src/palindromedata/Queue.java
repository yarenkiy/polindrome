package palindromedata;


public class Queue {
    Node front;
    Node rear;
    int cnt;
    int size;

    public Queue(int size) {
        this.size = size;
        front = null;
        rear = null;
        cnt = 0;
        
    }
    void enQueue(char ch){
        if(!isFull()){
            Node eleman = new Node(ch);
            if(isEmpty()){
                front = eleman;
                rear = eleman;
            }
            else{
                rear.next = eleman;
                rear = eleman;
            }
            cnt++;
            
        }
    }
    char deQueue(){
        if(!isEmpty()){
            char ch = front.letter;
            front = front.next;
            cnt--;
            return ch;
        }
        else{
            return '+';        
        }
         
    }

     boolean isFull() {
        return cnt == size;
     }

     boolean isEmpty() {
       return cnt == 0;
    }

            
    
}
