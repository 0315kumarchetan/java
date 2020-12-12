import java.util.ArrayList;
public class heap {
    private static class ownHeap{

        ArrayList<Integer> arr = new ArrayList<>();

        public ownHeap(int[] data){
            constructHeap(data);
        }

        private void constructHeap(int[] data){
            for (int d : data) arr.add(d);

            for(int i = arr.size()-1;i>=0;i--){
                downheapfy(i);
            }

        }
        
        private void downheapfy(int pi){
            int maxidx = pi;
            int lci = 2*pi+1;
            int rci = 2*pi+2;

            if(lci  <  arr.size() && arr.get(lci) > arr.get(maxidx)) maxidx = lci ;
            if(rci < arr.size() && arr.get(rci) > arr.get(maxidx)) maxidx =rci;

            if(maxidx != pi){
                swap(pi , maxidx);
                downheapfy(maxidx);
            }
        }

        private void  swap(int i , int j){
            int v1 = arr.get(i);
            int v2 = arr.get(j);

            arr.set(i,v2);
            arr.set(j,v1);
        }
        private void upheapify(int ci){
            int pi = (ci-1)/2;
            if(pi >= 0 && this.arr.get(ci) > this.arr.get(pi)) {
                swap(pi , ci);
                upheapify(ci);
                
            }
        }
        //public function ########################=================================================
        public int size(){
            return this.arr.size();
        }
        public boolean isEmpty(){
            return this.arr.size()==0;
        }
        public int poll(){
            int rv = this.arr.get(0);
            swap(0,this.arr.size()-1);
            this.arr.remove(arr.size()-1);
            downheapfy(0);
            return rv;

        }
        public void add(int data){
            arr.add(data);
            upheapify(this.arr.size()-1);
        }
        public int peek(){
            return this.arr.get(0);
        }
       


    }

    public static void main(String[] args){

        int[] arr2 = { 3,2,1,5,6,4};
        ownHeap hp =new ownHeap(arr2);
        while(hp.size()!=0){
            System.out.print(hp.poll()+" ");
        }

    }
    
}