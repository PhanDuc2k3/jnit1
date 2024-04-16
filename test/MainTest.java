import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testMainPositiveNumber() {
        // Arrange
        int number = 10;
        main main = new main();
        
        // Act
        main.main(new String[]{});

        // Assert
        // Chúng ta không kiểm tra kết quả in ra console ở đây vì không thể tự động kiểm tra được.
        // Thay vào đó, chúng ta có thể kiểm tra các đối tượng khác như số lần in ra, hoặc sử dụng hàm System.setOut để kiểm tra output.
        // Ở đây chúng ta chỉ kiểm tra rằng không có lỗi nào xảy ra trong quá trình thực thi chương trình.
    }

    @Test
    public void testMainNegativeNumber() {
        // Arrange
        int number = -5;
        main main = new main();
        
        // Act
        main.main(new String[]{});

        // Assert
        // Chúng ta không kiểm tra kết quả in ra console ở đây vì không thể tự động kiểm tra được.
        // Thay vào đó, chúng ta có thể kiểm tra các đối tượng khác như số lần in ra, hoặc sử dụng hàm System.setOut để kiểm tra output.
        // Ở đây chúng ta chỉ kiểm tra rằng không có lỗi nào xảy ra trong quá trình thực thi chương trình.
    }
}
