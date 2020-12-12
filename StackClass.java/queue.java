public class queue {
    private int[] arr;
    private int front;
    private int back;
    private int elementcount;
    
    private void initializeValue(int size){
        this.arr=new int[size];
        this.front=0;
        this.back=0;
        this.elementcount=0;
    }
    public int size(){
        return this.elementcount;    
    }
    public boolean isEmpty(){
        return this.size()==0;
    }
    public void push(int data)throws Exception{
        if(this.size()==this.arr.length){
            throw new Exception("this is full");
        }
        if(this.back!=arr.length ){
            this.arr[this.back]=data;
            this.back++;
            this.elementcount++;
        }
        else if(this.arr[this.back]!=0){
            this.arr[this.back%this.arr.length]=data;
        }
        

    }
    
}