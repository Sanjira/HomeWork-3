import org.testng.annotations.Test;

public class AccountPage extends JPBase {

    @Test
    public void testForSignIn() throws InterruptedException{

        jcpLogin();


    }
    @Test
    public void testSearchProduct() throws InterruptedException{
        productSearch();

        //for practice
    }
}
