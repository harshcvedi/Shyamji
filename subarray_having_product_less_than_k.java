  public static void main (String args[]) {
  Scanner sc =new Scanner(System.in);
  int N=sc.nextInt();
  int k=sc.nextInt();
  int arr[]=new int[N];
  for(int i=0;i<arr.length;i++){
   arr[i]=sc.nextInt();

  }
  int si=0;
  int ei=0;
  int s=1;
  int final2=0;
  while(ei<arr.length){
      s=s*arr[ei];
      while(s>=k ){
         s=s/arr[si];
         si++;
      }
      final2=final2+(ei-si+1);
      ei++;

  }
  System.out.print(final2);


}
    }
