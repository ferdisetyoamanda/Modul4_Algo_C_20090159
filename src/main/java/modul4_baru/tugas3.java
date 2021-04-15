package modul4;
public class tugas3 {
    public static void main(String[] args) {
        int A[] = {25,7,9,13,3};
       
        System.out.println("Data sebelum diurutkan : ");
        tugas3.print(A);
        tugas3.selectshort(A); 
        System.out.println("Data setelah diurutkan : ");
        tugas3.print(A);
        
    }
    public static void selectshort(int[]B){
        int littleindex;
        int pass;
        int j;
        int temp;
        for ( pass = 0; pass < B.length -1; pass++) {
            littleindex = pass;
            for (j = pass + 1; j < B.length; j++) {
                if(B[j]<B[littleindex]){
                    littleindex = j;
                }
                
            }
            temp = B[pass];
            B[pass] = B[littleindex];
            B[littleindex] = temp;
        }
         
        }
    public static void print(int[]data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
        System.out.println(" ");
        System.out.println("Nama = Ferdi");
        System.out.println("Nim  = 20090159");
    }

    
}
