/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import JDBC.Database;
import entities.Studentits;
import entities.StudentitsDAO;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author marcu
 */
@Path("StudentitsAPI")
@RequestScoped
public class StudentitsAPIResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of StudentitsAPIResource
     */
    public StudentitsAPIResource() {
    }

    /**
     * Retrieves representation of an instance of API.StudentitsAPIResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Path("students")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudentsJson() {
        List<Studentits> students = new StudentitsDAO().getStudents();
        return Response.ok(students).build();
    }

    /**
     * PUT method for updating or creating an instance of StudentitsAPIResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
