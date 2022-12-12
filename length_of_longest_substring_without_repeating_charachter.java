 public static void main (String args[]) {
        Scanner sc =new Scanner(System.in);
        String s =sc.next();
        int si=0;
        int ei=0;
        int arr[]=new int[256];
        int max=0;
        while(ei<s.length()){
            char ch=s.charAt(ei);
            arr[ch]++;
            while(arr[s.charAt(ei)]>1){
                arr[s.charAt(si)]--;
                si++;
            }
            max=Math.max(max,ei-si+1);
            ei++;
        }
        System.out.println(max);
    }
}
