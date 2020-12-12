public class stack {
    private int[] arr;
    private int tos;
    private int elementcount;
    
    
    private void setValues(int size){
        this.arr=new int[size];
       this.tos=-1;
        this.elementcount=0;
    }

    public stack(){
        setValues(10);
    }
    public stack(int size){
        setValues(size);
    }
    public int size(){
        return this.elementcount;
    }

    public boolean isEmpty(){
        return this.size()==0;
    }
    private void checkPeekException() throws Exception{
        if(isEmpty()){
            throw new Exception("stack is Empty");
        }
    }
    public int peek() throws Exception{
        try{
            checkPeekException();
            return this.arr[this.tos];
        }
        catch(Exception e){
                System.out.println("handled");
        }
        return -1;
    }
    public void push(int data)throws Exception{
        if (this.size()==arr.length){
            throw new Exception("stack is Full");
        }
            this.arr[++this.tos]=data;
            this.elementcount++;
        

    }
    public int pop()throws Exception{
        if (this.size()==0){
            throw new Exception("this stack is empty ");
        
        }
            int rv = this.arr[this.tos];
            this.arr[this.tos--]=0;
            this.elementcount--;
        return rv;
    }
 }