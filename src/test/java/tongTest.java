import com.example.ktnc_th01926_final.TongSoChan;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class tongTest {
    private TongSoChan tongSoChan = new TongSoChan();
    @Test
    public void test1(){
        Assertions.assertTrue(tongSoChan.tongSoChan() < 1275);
    }

    @Test
    public void test2(){
        Assertions.assertTrue(tongSoChan.tongSoChan() > 0);
    }
    @Test
    public void test3(){
        Assertions.assertEquals(482, tongSoChan.tongSoChan());
    }

    @Test
    public void test4(){
        Assertions.assertNotEquals(650,tongSoChan.tongSoChan()  );
    }

    @Test
    public void test5(){
        Assertions.assertNotEquals(1107,tongSoChan.tongSoChan() );
    }
}
