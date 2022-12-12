
    public static void main (String args[]) {
        Scanner sc= new Scanner(System.in) ;
        int n=sc.nextInt() ;
        int m= sc.nextInt() ;
        int a[][]= new int[n][m] ;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j]=sc.nextInt() ;
            }
        }
        int r= sc.nextInt() ;
        int c= sc.nextInt() ;
        int b[][] = new int[r][c];
        if(r*c== m*n){
            int k=0; 
            int l=0; 
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    b[k][l]=a[i][j] ;
                    l++ ;
                    if(l==c){
                        k++ ;
                        l=0 ;
                    }
                }
            }
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    System.out.print(b[i][j] + " ") ;
                }
                System.out.println() ;
            }
        }
        else{
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    System.out.print(a[i][j] + " ") ;
                }
                System.out.println() ;
            }
        }
        sc.close() ;

    }
}
