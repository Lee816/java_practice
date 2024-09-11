package application.s114;

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

            System.out.printf("(%d,%d)\t",x,y);
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

        for (int i=0 ; i < n ; i++){
            for (int j=0 ; j<n ; j++){
                System.out.println(magic[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
