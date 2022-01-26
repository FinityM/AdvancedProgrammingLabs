import java.io.IOException;
import java.util.PropertyResourceBundle;

/** Encountered a syntax mistake here by using the english locale property file, led to more edits to the code further
 * breaking the program once I fixed the initial issue,
 * Looks like Version Control is going to be important.....
 *
 */
public class ResourceProperty_fr extends PropertyResourceBundle {
    public ResourceProperty_fr() throws IOException {
        super(ResourceProperty_fr.class.getResourceAsStream("ResourceProperty_fr.properties"));
        System.out.println("Something happening here..." + ResourceProperty_fr.class.getCanonicalName() + " " + ResourceProperty_fr.class.getPackageName());
    }

}
