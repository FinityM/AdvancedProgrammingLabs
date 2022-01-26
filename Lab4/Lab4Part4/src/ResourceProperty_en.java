import java.io.IOException;
import java.util.PropertyResourceBundle;

public class ResourceProperty_en extends PropertyResourceBundle {
    public ResourceProperty_en() throws IOException {
        super(ResourceProperty_en.class.getResourceAsStream("ResourceProperty_en.properties"));
        System.out.println("Something happening here..." + ResourceProperty_en.class.getCanonicalName() + " " + ResourceProperty_en.class.getPackageName());
    }

}
