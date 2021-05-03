package models;
//import org.sql2o.Connection;




public class Animals {
    private double id;
    private String name;
    private String age;
    private String healthStatus;
    private String animalCategory;

//    private DB db=new DB();


    public Animals(double id,String name, String age,String animalCategory,String healthStatus){

        this.id=id;
        this.name=name;
        this.age=age;
        this.healthStatus=healthStatus;
        this.animalCategory=animalCategory;

    }
    public double getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getAge(){
        return this.age;
    }
    public String getHealthStatus(){
        return this.healthStatus;
    }
    public String getAnimalCategory(){
        return this.animalCategory;
    }


//    public boolean keep(){
//
//        db.getCon().createQuery("INSERT INTO animals (id,name,age,healthStatus,animalCategory) VALUES(:id,:name,:age,:healthStatus,:animalCategory)")
//                .addParameter("id",id)
//                .addParameter("name",name)
//                .addParameter("age",age)
//                .addParameter("healthStatus",healthStatus)
//                .addParameter("animalCategory",animalCategory)
//
//                .executeUpdate();
//        return  true;
//    }

}


