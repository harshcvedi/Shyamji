 public static void main (String args[]) {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();

        int arr[]=new int[N];
        for(int i=0;i<arr.length;i++){


            arr[i]=sc.nextInt();

        }
        int count=1;


        int maximumm=1;
        for(int i=0;i<N-1;i++){
            if(arr[i]<arr[i+1]){



                count++;
            }
            else if(arr[i]>=arr[i+1]){
                



                maximumm=Math.max(maximumm,count);


                count=1;
            } 
        }int c=Math.max(count,maximumm));

        
        System.out.println(c);
    }
}
