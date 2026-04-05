class test {
    int[] queue;
    int size;
    int f, r;

    test(int size) {
        this.size = size;
        queue = new int[size];
        f = r = -1;
    }

    void insertrare (int element) {

        if(f==0 && r=size-1||f==r+1){
            //full
        }
        else{
            if(f==-1){
                //empty
                f=r=0;
            }
            elseif( r=size-1){
                r=0;
            }
            else{
                r++;
            }
            queue[r]=element;



        }
        

        
        queue[r] = element;
        System.out.println(element + " inserted");
        }
    }
    

    void insertfront() {
                if(f==0 && r=size-1||f==r+1){
            //full
        }
        else{
            if(f==-1){
                //empty
                f=r=0;
            }
            elseif( f=0){
                f=size-1;
            }
            else{
                f--;
            }
            queue[r]=element;
        }
        queue[r] = element;
        System.out.println(element + " inserted");
        }

   void getfront ()
    getlast



    int deletefront (){
        if(f==-1){
            //empty
            return -999999999;
        }
        else{
            
            element = queue[front];
        if (f ==r) {//single elment
            f = r = -1;
        } else if (f==size-1){
            f=0;
        }else(
            f++;
        )
        return element;
        }
        

        int deletereare(){
               if(f==-1){
            //empty
            return -999999999;
        }
        else{
            
            element = queue[front];
        if (f ==r) {//single elment
            f = r = -1;
        } else if (r==0){
            r=size-1;
        }else(
            r--;
        )
        return element;
        }
        else{
            
            element = queue[front];
        if (f =r=0) {//single elment
            f = r = -1;
        } else {
            f++;
        }
        return element;
        }

        }
        
    }
    void display() {
        for (int i=f;i<=r;i++) {
                System.out.print(queue[i]+" ");
        }
    
    }

    public static void main(String[] args) {

        test t1 = new test(5);



        t1.enqueue(10);

        t1.enqueue(60); 

        t1.dequeue();
        t1.dequeue();
        t1.display();
    }
}
//ArrayDeque class