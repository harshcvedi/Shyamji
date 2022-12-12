 public static void main (String args[]) {
Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      ArrayList <Integer> list=new ArrayList<>();
        while(true){
            int t=sc.nextInt();
            if(t==-1){
                break;
            }else{
            list.add(t);
        }
        }
      double sum=0;
      for(int i=1;i<=n;i++){
         sum=sum+list.get(i-1);
         System.out.printf("%.4f",sum/i);
         System.out.print(" ");
        
      }
      for(int i=n;i<list.size();i++){
         sum=sum+list.get(i)-list.get(i-n);
        System.out.printf("%.4f",sum/n);
        System.out.print(" ");
         
      }
      
    }
}
