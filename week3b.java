public class week3b {
    public static int set(int a){
        int  p = 1;
        int count = 0;
        while(p<=a){
          int m = a&p;
          if(m!=0){
           count++;
          }
          p=p<<1;
        }
        return count;

    }
    public static Boolean pow(int a){
        int  p = 1;
        Boolean b = true;
        int count = 0;
        while(p<=a){
          int m = a&p;
          if(m!=0){
           count++;
          }
          p=p<<1;
        }
       if (count==1){
        b=true;
       }
       else{
        b = false;
       }
return b;

    }
    //q3
    public static int us(int a,int b){
      int p = 1;
      p=p<<b;
      int m = a|p;
      return m;
    }
    //q4
    public static int clear(int a,int b){
        int p = 1;
        p=p<<b;
        int m = a^p;
        return m;
      }
    //q5
    public static int toggle(int a,int b){
        int  p = 1;
        p=p<<b;
        int o;
        int t = a&p;
        if(t==0){
            o = us(a,b);
        }
        else{
           o = clear(a, b);
        }
        return o;    
    }
    //q6
    public static void srr(int arr[]){
        int mrr[]=new int[100];int p =0;
        //vo find kar jo double bari hai and arr mein store kar
      for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            int y = arr[i]^arr[j];
            if(y==0){
              mrr[p]=arr[i];
              p++;
            }
        }
      }
      //jo naye arr mein store kiye hain vo element purane mein 0 kar de
     for (int i = 0; i < p; i++) {
        for (int j = 0; j < arr.length; j++) {
            if(mrr[i]==arr[j]){
                arr[j]=0;
            }
        }
     }
     //non zero elements print kar 
     for (int i = 0; i < arr.length; i++) {
        if (arr[i]!=0) {
            System.out.println(arr[i]);
        }
     }
    }
   
    public static void main(String[] args) {
        int arr[]={2,3,3,4,4,5,6,8 ,8 ,9};
      srr(arr);
    }
}
