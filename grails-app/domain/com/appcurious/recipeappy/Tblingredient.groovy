package com.appcurious.recipeappy

class Tblingredient {

    String ingredientname
    String type
    int ingredientId
    int ingredienttype
    int id
    int version




    static constraints = {
    }

    Tblingredient(){
        //System.out.println("made ingredient")
    }

    Tblingredient(String name,String type){
        setIngredientname(name)
        setType(type)
    }
    Tblingredient(String name,int ingredientType){
        setIngredientname(name)
        setIngredienttype(ingredientType)
    }

    def Tblingredient[] findAll(){
        def ingredients = Tblingredient.findAll()
        ingredients
    }

    def Tblingredient findById(int id){
        def ingredient = Tblingredient.findById(id)
        ingredient
    }

    def void setIngredientname(String s){
        ingredientname = s

    }

    def String getIngredientName(){
        ingredientname
    }

    def void setType(String t){
        type = t
    }

    def String getType(){
        type
    }

    def void setIngredienttype(int ingredientType){
        ingredienttype = ingredientType
    }

    def int getIngredienttype(){
        ingredienttype
    }
}
