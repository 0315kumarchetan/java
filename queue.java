public class queue {
    private int[] arr;
    private int front;
    private int rear;
    private int ele_count;

    private void initializeValue(int size){
        this.arr=new int[size];
        this.front=-1;
        this.rear=-1;
        this.ele_count=0;
    }


    public queue(int size){
        initializeValue(size);

    }

    public int front_ele(){
        if(this.isEmpty()){
            throw new Exception("queueIsEmpty");
        }

        return this.arr[this.front];
    }
    public int size(int size){
        return this.ele_count;
    }

    public boolean isEmpty(){
        return this.ele_count==0;
    }

    public void push(int data) throws Exception{
        if (this.rear==arr.length){
            throw new Exception("QueueIsFull!");
        }

        this.arr[++this.front]=data;
        this.ele_count++;
        this.rear++;
    }

    public int pop() throws Exception{
        if(this.front==-1){
            throw new Exception("QueueIsEmpty!");
        }
        int val = this.arr[this.front];
        this.front=this.front++;
        this.ele_count--;
        return val;
    }
    
}