class Queue{
    int queue[] = new int[5];
    int f = 0 ,r = 0, size = 0;
    public void enqueue(int x){
        if(r < 5){
            queue[r] = x;
            r++;
            size++;
        }
        else{
            System.out.println("Queue is full.");
        }
    }
    public void dequeue(){
        if(r != f){
            f++;
            size--;
        }
        else{
            System.out.println("Queue is empty.");
        }
    }
    public void diaplay(){
        if(f != r){
            for(int i = f; i < r; i++){
                System.out.print(queue[i] + " ");
            }
        }
        System.out.println();
    }
    public void isEmpty(){
        if(size == 0)
            System.out.println("Queue is empty.");
        else
            System.out.println("Queue is not empty.");
    }
    public int peek(){
        return queue[f];
    }

}
class Main{
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.diaplay();
        q.dequeue();
        q.diaplay();
        q.isEmpty();
        System.out.println("The peek value : " + q.peek());
    }
}