package insertionsort;

public class ALGORITHM {

    void insertion(int d[]) {
        int i;
        for (i = 1; i < d.length; i++) {

            int j = i;
            while ( j > 0 && d[j] < d[j - 1]) {
                int t = d[j - 1];
                d[j - 1] = d[j];
                d[j] = t;

                j--;
            }
        }

    }

    public static int binaryseaarch(int d[], int x, int son, int i) {
        int orta = (i + son - 1) / 2;
        if (i >= 0) {
            if (d[orta] == x) {
                return d[orta];
            } else if (d[orta] > x) {
                return binaryseaarch(d, x, son - 1, i);
            } else {
                return binaryseaarch(d, x, son + 1, i);
            }
        }
        return -1;
    }

    public static void selectionsort(int d[]) {
        int min;
        for (int i = 0; i < d.length; i++) {  //5,1,2,9,1
            min = i;
            for (int j = i + 1; j < d.length; j++) { 
                if (d[j] < d[min]) {

                    min = j;
                }
                int temp = d[min];
                d[min] = d[i]; //min ==j dusun
                d[i] = temp;

            }
        }
    }

    static void printarray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void boublesort(int d[]) {
        System.out.println("bouble sort");
        int tmp;
        boolean gecerli = true;
        while (gecerli) {
            gecerli = false;
            for (int i = 1; i < d.length; i++) {
                if (d[i - 1] > d[i]) {
                    tmp = d[i - 1];
                    d[i - 1] = d[i];
                    d[i] = tmp;
                    gecerli = true;
                }
                System.out.print(d[i] + " ");
            }
        }
    }

    public boolean linnersearch(int d[], int x) {
        for (int i = 0; i < d.length; i++) {
            if (d[i] == x) {
                return true;

            }

        }
        return false;

    }

    void linnerprint(int d[], int x) {
        System.out.println(x + " bulndumu: " + linnersearch(d, x));
    }

    public static void main(String[] args) {
        int f[] = {3, 4, 2, 7, 97, 76, 5, 543, 32, 23, 33};
        System.out.println("ınsertion sort");
        ALGORITHM v = new ALGORITHM();

        v.insertion(f);

        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i] + " ");
        }
        System.out.println();
        System.out.println("rekürsif binnary search");
        System.out.println(" binary search aranan:" + binaryseaarch(f, 32, f.length, 0));
        boublesort(f);

        int dizi[] = {2, 9, 3, 7, 1, 56, 0};
        selectionsort(dizi);
        System.out.println();
        System.out.println("selection sort:");
        printarray(dizi);
        System.out.println();
        System.out.println("linner search");
        v.linnerprint(f, 33);
        System.out.println();
        System.out.println("döngülü binary search");
        v.printbinarysearch(f, 3);
        System.out.println();
        System.out.println("MERGESORT");
//        v.mergesort(f,0,f.length-1);
  //      v.printmerge(f);
        
    }

    boolean binarysearh(int d[], int ara) {
        int sol = 0;
        int sag = d.length - 1;
        while (sol <= sag) {
            int orta = (sol + sag) / 2;
            if (d[orta] == ara) {
                return true;
            } else if (ara > d[orta]) {
                sol = orta + 1;

            } else {
                sag = orta - 1;
            }
        }
        return false;
    }

    void printbinarysearch(int d[], int ara) {
        System.out.println(ara + " " + "bulundumu: " + binarysearh(d, ara));
    }

   /* void mergesort(int d[], int bas, int son) {
        int pivot;
        if (bas < son) {
            pivot = (son - bas) / 2;
            mergesort(d, bas, pivot - 1);
            mergesort(d, pivot + 1, son);
            merge(d, bas, pivot, son);
        }
    }

    void merge(int d[], int bas, int pivot, int son) {
        int sag[], sol[];
        int n1, n2,i,j,k;
        n1 = pivot - bas + 1;
        n2 = son - pivot;
        sag = new int[n2 + 1];
        sol = new int[n1 + 1];
        for (i = 0; i <n1; i++) {
            sol[i] = d[bas + i];
            
        }
         for ( j = 0; j <n1; j++) {
            sag[j] = d[son + j];
            
         }
    sol[n1+1]=Integer.MAX_VALUE;
       sag[n2+1]=Integer.MAX_VALUE;
        i=0;
        j=0;
      
        for( k=0;k<=son;k++){
        if(sol[i]<sol[j]){
        d[k]=sol[i];
        i++;
        }
        else {
        d[k]=sag[i];
        j++;
        }
        } 
    }

  void printmerge(int d[]){
  for(int i=0;i<d.length;i++){
      System.out.println(d[i]+" ");
  }
  }  
   */ 
}
