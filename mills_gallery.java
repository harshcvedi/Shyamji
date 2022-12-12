 public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();







     int arr[]=new int[n];
     for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
     }
     
     int k=sc.nextInt();
     int counterr=0;
     int q=-1;
     int i=0;
     if(arr[i+1]!=1&&arr[i]==0 )
     {
         counterr++;
         q=i;
     }
     for( i=1;i<n-1;i++)
     {
         if(arr[i]==0 && q!=i-1 &&arr[i-1]!=1 &&arr[i+1]!=1){
             q=i;


















           counterr++;}
     }












     
     if(arr[i]==0 && q!=i-1 && arr[i-1]!=1){
     













         counterr++;
     }
    if(counterr>=k){
        System.out.print("true");










    }
    else{
    








        System.out.print("false");
    }
    
    
    }

    }
