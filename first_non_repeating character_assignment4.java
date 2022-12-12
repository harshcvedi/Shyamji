    Scanner sc =new Scanner(System.in);
   
   int t=sc.nextInt();
  while(t-->0){
    
      String s=sc.next();
      int flag=0;
     for (int i=0;i<s.length();i++){
       int count=0;
       for(int j=0;j<s.length();j++){
           if(s.charAt(i)==s.charAt(j)){
               count++;
               
           }
       }
        if(count==1){
           System.out.println(s.charAt(i));
           flag=1;
           break;
       }

     
      }if(flag==0){
          System.out.println(-1);
      }
    }
   }
}
