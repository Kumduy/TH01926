import com.example.ktnc_th01926_final.NhanVienService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NhanVienTest {
    NhanVienService nhanVienService= new NhanVienService();

    @Test
    public void testNV1(){
        String exp = "Sửa nhân viên thành công";
        String act = nhanVienService.updateNhanVien("NV1", "TH01926", 20, 200f, 3, "IT");
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void testNV2(){
        String exp = "Không tìm thấy nhân viên";
        String act = nhanVienService.updateNhanVien("NV9999", "TH01926", 20, 200f, 3, "IT");
        Assertions.assertEquals(exp,act);
    }

    @Test
    public void testNV3(){
        String exp = "Tuổi nhân viên phải lớn hơn 18";
        String act = nhanVienService.updateNhanVien("NV3", "TH01926", 1, 200f, 3, "IT");
        Assertions.assertEquals(exp,act);
    }

    @Test
    public void testNV4(){
        String exp = "Lương phải lớn hơn 0";
        String act = nhanVienService.updateNhanVien("NV1", "TH01926", 19, (float) -1, 3, "IT");
        Assertions.assertEquals(exp,act);
    }

    @Test
    public void testNV6(){
        Assertions.assertThrows(NullPointerException.class, () -> nhanVienService.updateNhanVien(null, null, null, null, null, null));
    }
}
