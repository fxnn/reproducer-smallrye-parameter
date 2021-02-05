import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;

@Path("/")
public interface ExampleResource {
  @GET
  @Path("/{pathParam1}/{pathParam2}")
  @Parameter(ref = "queryParam1")
  String exampleEndpoint(
      @PathParam("pathParam1") String pathParam1, @PathParam("pathParam2") String pathParam2);
}
