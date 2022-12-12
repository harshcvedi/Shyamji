
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++)
            arr[i]=sc.nextInt();
        int mx=arr[0];
        for(int i=0;i<=n-1;i++){
            if(arr[i]>mx)
                mx=arr[i];
        }
        int[] f=new int[mx+1];
        int ei=0,si=0,len=0;
        while(ei<=n-1){
            f[arr[ei]]++;
            while(f[arr[ei]]>1 && si<=ei){
                f[arr[si]]--;
                si++;
            }
            len=Math.max(len,ei-si+1);
            ei++;
        }
        System.out.println(len);
    }
}
