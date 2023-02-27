import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

    @Test
    void updateFirstName(){

        Contact c = new Contact("1234567","Joe","Rogan","221B Bakers Street","090078601");
        ContactService cs = new ContactService();
        cs.addContact(new Contact("1234567","Joe","Roland","221B Bakers Street","090078601"));
        cs.updateLastName("1234567","Rogan");
        Assert.assertEquals(c.getLastName(),cs.getContact("1234567").getLastName());
    }
}