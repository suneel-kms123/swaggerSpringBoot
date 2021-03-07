import com.uk.sprint.rest.impl.JavaStreamFilterImpl;
import com.uk.sprint.rest.model.ModelDataStream;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JunitTestStream {

    private JavaStreamFilterImpl javaStreamFilter = new JavaStreamFilterImpl();

    @Test
    public void testScenario(){
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
        List<ModelDataStream> list = new ArrayList<ModelDataStream>();
        list.add(modelDataStream);
        list.add(modelDataStream1);
        javaStreamFilter.getFilterStreamDataResult(list);
    }

}
