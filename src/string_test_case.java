import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class string_test_case {
    private String_Calculato sc;
    @Before
    public void initilaize(){
        sc=new String_Calculato();
    }
    @Test
    public void empty_string()  {
       assertEquals(sc.calculate(""),0);
    }
    @Test
    public void singlenumber() throws Exception{
        assertEquals(sc.calculate("1"),1);
    }
}
