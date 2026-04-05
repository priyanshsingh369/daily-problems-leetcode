class test {
    int[] queue;
    int size;
    int f, r;

    test(int size) {
        this.size = size;
        queue = new int[size];
        f = r = -1;
    }

    void enqueue(int element) {

        
        if (r == size - 1) {
            
            r++;
        }

        else{
        if (f == -1) {
            f = r=0;
        }
        if ((f==0&&r==size-1)||f==r+1){//1st ye chack kr na hai hai
        

            r=(r+1)%size;
            f=(f+1)%size;
        }

        
        queue[r] = element;
        System.out.println(element + " inserted");
        }
    }

    void dequeue() {

        int element ;

        if (f == -1) {
            return;
        }
        else{
            element = queue[front];
        if (f == r) {
            f = r = -1;
        } else {
            f++;
        }
        return element;
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