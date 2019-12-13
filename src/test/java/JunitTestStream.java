import com.uk.sprint.Rest.Impl.JavaStreamFilterImpl;
import com.uk.sprint.Rest.model.ModelDataStream;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JunitTestStream {

    private JavaStreamFilterImpl javaStreamFilter = new JavaStreamFilterImpl();

    @Test
    public void testScenario(){
        List<ModelDataStream> list = new ArrayList<ModelDataStream>();
        ModelDataStream modelDataStream = new ModelDataStream();
        modelDataStream.setCity("bengaluru");
        modelDataStream.setCountry("India");
        modelDataStream.setName("raghavendra");
        modelDataStream.setSurname("guru");

        ModelDataStream modelDataStream1 = new ModelDataStream();
        modelDataStream1.setCity("Bengaluru");
        modelDataStream1.setCountry("INDIA");
        modelDataStream1.setName("sairam");
        modelDataStream1.setSurname("guru");
        list.add(modelDataStream);
        list.add(modelDataStream1);
        javaStreamFilter.getFilterStreamDataResult(list);
    }

}
