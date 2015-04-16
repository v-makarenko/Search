package resources;


import com.sun.jersey.multipart.FormDataMultiPart;
import dto.ImageDto;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//import javax.enterprise.context.ApplicationScoped;

/**
 * Created by VMakarenko on 4/15/2015.
 */
@Path("search")
@Produces("application/json")
public class SearchResource {
    /**
     * initiate search and return metadata
     */
    @POST
    @Path("/upload")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response uploadFile(FormDataMultiPart contentDispositionHeader) {
        List<ImageDto> dtoList = new ArrayList<>();
        // TODO remove before flight
        ImageDto dto1 = new ImageDto();
        dto1.setWidth(640);
        dto1.setHeight(480);
        dto1.setLink("http://pornhub.com");
        dto1.setLinkToOrigin("http://vk.com");
        dto1.setName("Крутая пикча");
        dto1.setSize(new BigDecimal("120210925"));
//        dto1.setPreview();
        dto1.setLink("http://pornhub.com");
        ImageDto dto2 = new ImageDto();
        dto2.setWidth(320);
        dto2.setHeight(240);
        dto2.setLink("http://google.com");
        dto2.setLinkToOrigin("http://makarenko.io");
        dto2.setName("Так себе пикча");
        dto2.setSize(new BigDecimal("12124015423"));
//        dto1.setPreview();
        dtoList.add(dto1);
        dtoList.add(dto2);
        // TODO remove before flight
        return Response.ok(dtoList).build();
    }

//    @GET
//    public Response getSearch(){
////        return makeSearch();
//    }

//    /** get pic bytearray by id */
//    public Response getById(@QueryParam(value="id") Long id){
//
//    }

}
