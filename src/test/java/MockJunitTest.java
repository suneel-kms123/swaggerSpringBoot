import com.uk.sprint.Rest.ConnectionMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RunWith(MockitoJUnitRunner.class)
public class MockJunitTest {

   @Mock
   ConnectionMock connectionMock;

   @Mock
   ResponseEntity responseEntity;

    @Before
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
