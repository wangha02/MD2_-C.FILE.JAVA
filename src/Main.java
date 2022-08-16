import java.io.*;

public class Main {

    private final static String FILE_URL = "C:\\Users\\Admin\\IdeaProjects\\TinhKetQuaFizzBuzz\\untitled2\\untitled7\\src\\file.txt";
    public static void main(String[] args) throws IOException {

        File file = new File(FILE_URL);
        //FILE_URL: Chính là đường dẫn đến tệp, ở đây mình dùng đường dẫn tuyệt đối
        //File: Lớp này sẽ lấy file dữ liệu từ đường dẫn ở trên, nếu đường dẫn không hợp lệ thì nó sẽ trả ra ngoại lệ
        InputStream is = new FileInputStream(file);
        InputStreamReader inSr = new InputStreamReader(is);
//is: Khởi tạo một inputStream từ file ở trên chuẩn bị cho việc đọc file.
        //InSr: Từ inputStream ở trên tạo ra một đối tượng có thể đọc được. Ở đây là chỉ đọc được từng kí tự mà thôi nhé !
        int c;
        while ((c = inSr.read()) != -1){
            System.out.println((char) c);

        }


    }
}