import model.ComputerRepairRequest;
import org.junit.Assert;
import org.junit.Test;
public class ComputerRepairRequestTest {
    @Test
    public void testExample(){
        ComputerRepairRequest crr= new ComputerRepairRequest();
        Assert.assertEquals("",crr.getOwnerName());
        //Assert.assertEquals("",crr.getOwnerAdress());
    }


}
