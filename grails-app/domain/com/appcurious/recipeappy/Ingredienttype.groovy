package com.appcurious.recipeappy

class Ingredienttype {

    String type
    int version
    int id

    static constraints = {
    }

    Ingredienttype(){

    }

    Ingredienttype(String type){
        setType(type)
    }

    def Ingredienttype[] findAll(){
        def types = Ingredienttype.findAll()
        types
    }

    def void setType(String t){
        type = t
    }

    def String getType(){
        type
    }

    def int getId(){
        id
    }

    def int getVersion(){
        version
    }
}
