import java.lang.reflect.*;

public class InvestigatorClass {
    public static void main(String[] args) {
        TheMysteryClass investigate = new TheMysteryClass();

        Field[] theFields = investigate.getClass().getFields();
        Method[] theMethods = investigate.getClass().getDeclaredMethods();

        System.out.println("Mystery class fields: ");

        int theModifier;
        for (int fields = 0; fields < theFields.length; ++fields){
            theModifier = theFields[fields].getModifiers();
            System.out.println(Modifier.toString(theModifier));
            System.out.println(theFields[fields].getType().toString());
            System.out.println(theFields[fields].getName());
        }

        System.out.println("\nMystery class methods: ");

        for (int methods = 0; methods < theMethods.length; ++methods){
            theModifier = theMethods[methods].getModifiers();
            System.out.println(Modifier.toString(theModifier));
            System.out.println(theMethods[methods].getName());
            System.out.println(theMethods[methods].getParameterCount());

            Parameter[] prms = theMethods[methods].getParameters();

            for (int paramaters = 0; paramaters < prms.length; ++paramaters){
                System.out.println(prms[paramaters].getName());
                System.out.println(prms[paramaters].getType().toString());
            }
        }

        try {
            System.out.println("\n" + theMethods[2].invoke(investigate,(Object[])args));

        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        catch (InvocationTargetException e){
            e.printStackTrace();
        }

    }
}
