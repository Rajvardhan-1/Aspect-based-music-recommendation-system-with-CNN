public class Pattern {
    
    public static void main(String[] args) {
        int height=5;
        int x=-1;

        for(int i=0;i<=height;i++){
            x++;
            
            for(int k=height-1;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                
            }
            System.out.print("\n");
        }
    }
}
