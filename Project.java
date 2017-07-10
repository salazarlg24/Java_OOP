class Project {
    private String name;
    private String description;
    
    public Project() {

    }
    public Project(String name) {
        name = name;
    }
    
    public Project(String name, String description) {
        name = name;
        description = description;
    }

    public String elivatorPitch(String name, String description){

        return name +" : "+ description;
    }

    // setters
    public void setName(String nameParam){
        name = nameParam;
    }

    public void setDescription(String descParam){
        description = descParam;
    }

    // getters
    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }
        

}