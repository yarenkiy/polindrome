package palindromedata;


public class Stack {
    Node top;
    int size;
    int cnt;
    
    public Stack(int size){
        this.size = size;
        cnt = 0;
        top = null;
        
    }
   void push(char ch){
      if(!isFull()){
          Node eleman = new Node(ch);
          
      
      if(isEmpty()){
          top= eleman;
        
      }
      else{
         eleman.next = top;
         top = eleman;
      }
      cnt++;
      
      }      
        
    }
   char pop(){
       if(!isEmpty()){
           char letter = top.letter;
           top = top.next;
           cnt--;
           return letter;
       }
       else{
           return '-';
           
       }
    }
   boolean isEmpty(){
       return cnt == 0;
   }
       
       boolean isFull(){
       return cnt == size;
   }
}