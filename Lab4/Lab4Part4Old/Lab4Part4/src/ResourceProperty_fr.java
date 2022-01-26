import java.io.IOException;
import java.util.PropertyResourceBundle;

public class ResourceProperty_fr extends PropertyResourceBundle {
    public ResourceProperty_fr() throws IOException {
        super(ResourceProperty_fr.class.getResourceAsStream("ResourceProperty_fr.properties"));
        System.out.println("Something happening here..." + ResourceProperty_fr.class.getCanonicalName() + " " + ResourceProperty_fr.class.getPackageName());
    }

}
