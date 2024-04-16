import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest1 {

    @Test
    public void testMainPrintCount() {
        // Arrange
        main main = new main();
        
        // Act
        main.main(new String[]{});

        // Assert
        // Đảm bảo rằng câu lệnh in ra "Count: i" đã được gọi đúng số lần.
        // Đây là một phần của hàm main, nên chúng ta kiểm tra số lần in ra trong lớp Main.
        // Bạn có thể sử dụng System.setOut để kiểm tra output hoặc kiểm tra các biến đếm.
    }

    @Test
    public void testMainNegativeNumberOutput() {
        // Arrange
        int number = -5;
        main main = new main();
        
        // Act
        main.main(new String[]{});

        // Assert
        // Đảm bảo rằng câu lệnh in ra "Number is not positive." được gọi khi number là số âm.
        // Bạn có thể sử dụng System.setOut để kiểm tra output hoặc kiểm tra các biến đếm.
    }
}
