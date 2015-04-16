package resources;


import dto.ImageDto;

//import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
* Created by VMakarenko on 4/15/2015.
*/
@Path("search")
@Produces("application/json")
public class SearchResource {
    /** initiate search and return metadata */
    @POST
    public Response makeSearch(){
        List<ImageDto> dtoList = new ArrayList<>();
        // TODO remove before flight
        ImageDto dto1 = new ImageDto();
        ImageDto dto2 = new ImageDto();
        dtoList.add(dto1);
        dtoList.add(dto2);
        // TODO remove before flight
        return Response.ok(dtoList).build();
    }

    @GET
    public Response getSearch(){
        return makeSearch();
    }

//    /** get pic bytearray by id */
//    public Response getById(@QueryParam(value="id") Long id){
//
//    }

}
