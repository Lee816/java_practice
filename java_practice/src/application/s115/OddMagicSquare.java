package application.s115;

public class OddMagicSquare {
    private int[][] magic; // 2차원 정수 배열 언선
    private int n; // 마방진의 크기 n X n

    public int[][] getMagic(){
        return magic;
    }

    public OddMagicSquare(int n){
        magic = new int[n][n];
        this.n = n;
    }

    public OddMagicSquare(){
        this(3); // 생성자 오버로딩
    }

    public void make(){
        int x=0;
        int y=n/2;

        for (int i=1 ; i <= n*n ; i++){
            int temX=x; // 옮기기 전 x위치
            int temY=y; // 옮기기 전 y위치

            System.out.printf("(%d,%d) ",x,y);
            magic[x][y] = i ;

            // 위로 이동
            if (x-1<0){
                x=n-1;
            } else {
                x--;
            }

            // 왼쪽으로 이동
            if (y-1<0){
                y=n-1;
            } else {
                y--;
            }

            // 이미 존재
            if (magic[x][y]!=0){
                x=temX+1; // x의 기존위치 +1
                y=temY; // Y의 원위치
            }
        }
    }

    public void print(){
        System.out.println();
        System.out.println(n+"square is magic : " + isMagic());

        for (int i=0 ; i < n ; i++){
            for (int j=0 ; j<n ; j++){
                System.out.print(magic[i][j]+" ");
            }
            System.out.println();
        }
    }

    // row행에 대한 합
    private int sumRow(int row){
        int tot = 0;
        for (int i=0; i<n ; i++){
            tot += magic[row][i];
        }
        return tot;
    }

    // col열에 대한 합
    private int sumCol(int col){
        int tot=0;

        for (int i=0; i < n ; i++){
            tot += magic[i][col];
        }

        return tot;
    }

    // 역대각선 (2,0),(1,1),(0,2)
    private int sumDia(){
        int tot=0;

        for (int i =0; i < n ; i++){
            tot += magic[i][n-1-i];
        }

        return tot;
    }

    // 대각선 (0,0),(1,1),(2,2)
    private int sumReverseDia(){
        int tot=0;

        for (int i=0; i < n ; i++){
            tot += magic[i][i];
        }

        return tot;
    }


    // 마방진 판단
    private boolean isMagic(){
        boolean isM=true;

        int[] m = new int[2*n+2];

        for (int i=0 ; i<n ; i++){
            m[i]=sumRow(i);
            m[i+n]=sumCol(i);
        }
        m[2*n]=sumReverseDia();
        m[2*n+1]=sumDia();

        for (int i=0 ; i < m.length ; i++){
            if (m[0]==0 | m[0]!=m[i]){
                isM=false;
                break;
            }
        }

        return isM;
    }
}
