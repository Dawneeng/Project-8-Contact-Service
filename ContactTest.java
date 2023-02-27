import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void test(){
        assertThrows(IllegalArgumentException.class,()->{
            new Contact("1239087654623","Joe","Graham","234","23423");
        });
    }
}