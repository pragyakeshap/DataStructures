public class CircularQueue {

    Integer[] cq ;
    int beginning = -1;
    int end = -1;
    int size = 0;


    CircularQueue(int size){
        this.size = size;
        cq = new Integer[size];
    }

    public void enqueue(int val){
        if(beginning == -1 && end == -1){
            // first entry
            beginning++;
            cq[++end] = val;
        }else if(beginning + end +1 == cq.length){
            // Queue is full
            System.out.println("Queue is full !!");
            return;
        }else  if((end + 1)== cq.length && beginning != 0){
            // last element is occupied, check if there are any space in the beginning
            end = 0;
            cq[end] = val;
        }else{
            cq[++end] = val;
        }
    }

    public int dequeue(){

        if(beginning <= 0 && end <= 0){
            // Queue is empty
            return -1;
        }else if(end ==0){
            // move end pointer to the last element in the list
            end = cq.length;
            return cq[0];
        }else{
            int result = cq[beginning];
            cq[beginning++] = null;
            return result;
        }
    }

    public String toString(){
        String result = "";
        int last = (end < beginning) ? cq.length -1 : end;

            for(int i = beginning; i <= last; i++){
                result +=" " + cq[i];
            }
            if(end < beginning) {
                for (int i = 0; i <= end; i++) {
                    result += " " + cq[i];
                }
            }
            return result;
        }

    }


