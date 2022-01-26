import java.io.IOException;
import java.util.PropertyResourceBundle;

public class ProgramProperties_es extends PropertyResourceBundle {
    public ProgramProperties_es() throws IOException {
        super(ProgramProperties_es.class.getResourceAsStream("ProgramProperties_es.properties"));
        System.out.println("Something happening here...." + ProgramProperties_es.class.getCanonicalName() + " " + ProgramProperties_es.class.getPackageName());
    }

}

