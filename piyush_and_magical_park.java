import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc= new Scanner(System.in) ;
        int n=sc.nextInt() ;
        int m=sc.nextInt() ;
        int k=sc.nextInt() ;
        int s= sc.nextInt() ;
        char a[][]= new char[n][m] ;
        for(int i=0; i<n && s>=k; i++){
            for(int j=0; j<m && s>=k; j++){
                a[i][j]=sc.next().charAt(0) ;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a[i][j]=='.'){
                    s-=2 ;
                }
                else if(a[i][j]=='*'){
                    s+=5 ;
                }
                else if(a[i][j]=='#'){
                    s-- ;
                    break ;
                }
                s-- ;
            }
            s++ ;
            // System.out.println(s) ;
        }
        // int flag=0 ;
        if(s>= k){
            System.out.println("Yes") ;
            System.out.print(s) ;
        }
        else{
            System.out.println("No") ;
        }
        sc.close() ;
    }
}
