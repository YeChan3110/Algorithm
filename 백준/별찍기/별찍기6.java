public class 별찍기6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < i; j++){
                sb.append(" ");
            }
            for(int j = i; j < count; j++){
                sb.append("*");
            }
            bw.write(sb.toString() + "\n");
        }

        bw.flush();
    }
}
