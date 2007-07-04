package one2one;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Vector;

import ucm.map.AndJoin;

/**
 * Creates the CSM representation(Join) of the AndJoin object.
 * 
 * @see one2one
 */
public class AndJoinConverter implements AbstractConverter {

    private AndJoin aj;

    PathConnAttributes so = new PathConnAttributes();

    // constructors
    public AndJoinConverter(AndJoin aj) {
        this.aj = aj;
    }

    // prints XML representation of object to output file
    public void Convert(PrintStream ps, ArrayList source, ArrayList target, Vector warnings) {

        // object attributes
        String object_attributes = "<Join id=\"" + "h" + aj.getId() + "\" ";
        String traceabilityLink = "traceabilityLink=\"" + aj.getId() + "\" ";
        // output to file
        ps.print("			" + object_attributes + traceabilityLink);
        String closing_attribute = "/>";

        // optional attributes
        so.OptionalAttributes(aj, ps, source, target);

        ps.println(closing_attribute);
        ps.flush();

    }
}
