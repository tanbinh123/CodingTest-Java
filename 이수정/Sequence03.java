import java.io.*;
import java.util.StringTokenizer;

//순열 구하기 => 재귀함수 + 자기 자신 허용 + 시간초과 해결
public class Sequence03 {
    static int N, M;
    static int[] arr;
    static boolean[] visited; //인덱스로 방문 확인 여부 확인
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //1부터 N까지
        M = Integer.parseInt(st.nextToken());// M개 고르기
        arr = new int[M];
        visited = new boolean[N]; //4
        recursive(0);
        bw.flush();
        bw.close();


    }
    public static void recursive(int index) throws IOException {
        //base code

        if(index == M) {
            for (int i = 0; i < M; i++) {
                bw.write(String.valueOf(arr[i] + " "));
            }
            bw.newLine();//개행
            return;
        }
        //recursive code
        for (int i = 0; i < N; i++){ //0, 1, 2, 3
            //if(visited[i] == false) {//방문한적 없을 경우
            //visited[i] = false;
            arr[index] = i+1; // 값 넣어주고
            recursive(index + 1); //재귀
            //초기화
//                for(int j = i; j < N; j++) {
//                    visited[j] = false;
//                }

            //}
        }
    }
}



