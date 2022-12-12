 public static void main (String args[]) {
Scanner s=new Scanner(System.in);















      int n=s.nextInt();







      int arr[]=new int[n];








      for(int i=0;i<n;i++){
      
          
          
          
          
          
          arr[i]=s.nextInt();










      }
      int sum33=0;















      int sum55=0;






      int q=-1;
      for(int i=0;i<n;i++)
      {
          for(int j=i-1;j>=0;j--)
          {
              sum33+=arr[j];
          }
          for(int j=i+1;j<n;j++)
          {
              sum55+=arr[j];
          }
          if(sum33==sum55)
          {
              q=i;







              System.out.print(q);




              break;
          }
          else
          {
              sum33=0;




              sum55=0;
          }
      }
      if(q==-1){
      
          System.out.print(q);





      }

    }
}
