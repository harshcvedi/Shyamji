  public static void main (String args[]) {
Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();

        int arr[]=new int[N];
        for(int i=0;i<arr.length;i++){


            arr[i]=sc.nextInt();

        }
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        Arrays.sort(arr);





        max=Math.max(max,arr[0]*arr[1]*arr[n-1]);






        
        max=Math.max(max,arr[n-3]*arr[n-2]*arr[n-1]);
        System.out.println(max);

    }
}
