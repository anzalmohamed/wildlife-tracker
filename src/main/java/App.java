import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.Map;
import static spark.Spark.*;

public class App {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
    public static void main(String[] args) {

        port(getHerokuAssignedPort());
        staticFileLocation("/public");

        get("/", (request, response) -> { //request for route happens at this location
            Map<String, Object> model = new HashMap<String, Object>(); // new model is made to store information
            return new ModelAndView(model, "index.hbs"); // assemble individual pieces and render
        }, new HandlebarsTemplateEngine());

        get("/animalDetails", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String id = request.queryParams("id");
            String name = request.queryParams("name");
            String age = request.queryParams("age");
            String healthStatus = request.queryParams("healthStatus");
            String animalCategory= request.queryParams("animalCategory");
            model.put("id", id);
            model.put("name", name);
            model.put("age", age);
            model.put("healthStatus", healthStatus);
            model.put("animalCategory", animalCategory);
            return new ModelAndView(model, "animalDetails.hbs");
        }, new HandlebarsTemplateEngine());

                get("/animal", (request, response) -> { //request for route happens at this location
            Map<String, Object> model = new HashMap<String, Object>(); // new model is made to store information
            return new ModelAndView(model, "animal.hbs"); // assemble individual pieces and render
        }, new HandlebarsTemplateEngine());

        get("/animalSighting", (request, response) -> { //request for route happens at this location
            Map<String, Object> model = new HashMap<String, Object>(); // new model is made to store information
            return new ModelAndView(model, "animalSighting.hbs"); // assemble individual pieces and render
        }, new HandlebarsTemplateEngine()); //

        get("/sightings", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String loci = request.queryParams("loci");
            String date = request.queryParams("date");
            model.put("name", name);
            model.put("loci", loci);
            model.put("date", date);
            return new ModelAndView(model, "sightings.hbs");
        }, new HandlebarsTemplateEngine());


    }}