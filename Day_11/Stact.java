class Operation{
    int t = -1, size = 5;
    int []stack = new int[size];
    
    public void push(int x){
        if(t < size-1){
            t++;
            stack[t] = x;
        }
    }

    public void pop(){
        System.out.println();
        if(t != -1){
            System.out.print("Poped : " + stack[t]);
            stack[t] = 0;
            t--;
        }
    }

    public Object peek(){
        if(t != -1)
            return stack[t];
        return null;
    }

    public boolean isEmpty(){
        System.out.println();
        if( t == -1)
            return true;
        return false;
    }

    public void Display(){
        System.out.println();
        System.out.print("The Elements : ");
        for(int i = t; i >=0 ; i--)
            System.out.print(stack[i] + " ");
    }
}

public class Stact {
    public static void main(String[] args) {
        Operation s = new Operation();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.Display();
        s.pop();
        s.Display();
        System.out.println(s.isEmpty());
        System.out.println("Peek Element : " + s.peek());
    }
}