import com.uk.sprint.rest.utility.ConnectionMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
public class MockJunitTest {

    @Mock
    ConnectionMock connectionMock;
    @Mock
    ResponseEntity responseEntity;

    @BeforeEach
    public void setUp(){
        responseEntity = new ResponseEntity(HttpStatus.ACCEPTED);
        Mockito.when(connectionMock.getForEntity(Mockito.anyString(),
                ArgumentMatchers.any(Class.class))).thenReturn(responseEntity);
    }

    @Test
    public void testSample(){
        responseEntity = connectionMock.getForEntity("", MockJunitTest.class);
        System.out.print(responseEntity.getStatusCode());
    }


}
