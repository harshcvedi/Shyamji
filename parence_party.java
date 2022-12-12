 public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];










       for(int i=0;i<n;i++){
       
           arr[i]=sc.nextInt();
       }





       Arrays.sort(arr);







       int i=0;






       int j=i+1;






       int sum55=0;





       while(j    <arr.length){











       
           int q=Math.min(arr[i],arr[j]);
           sum55+=q;












           i+=2;
           j+=2;
       }
       System.out.print(sum55);

    }
}
