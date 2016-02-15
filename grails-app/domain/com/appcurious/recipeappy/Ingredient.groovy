package com.appcurious.recipeappy

class Ingredient {

    String ingredientname
    int ingredienttype
    int id
    int version

    static constraints = {
    }

    Ingredient(){
        //System.out.println("made ingredient")
    }


//    def Ingredient[] findAll(){
//        def ingredients = Ingredient.findAll()
//        ingredients
//    }

    def Ingredient findById(int id){
        //def query = Ingredient.where {id==id}
        //def ingredient = Ingredient.find(id=id)
        //def ingredient = query.find()
        def ingredient = Ingredient.find("from ingredient as i where i.id = ?",[id])
                ingredient
    }

    def void setIngredientname(String s){
        ingredientname = s

    }

    def String getIngredientname(){
        ingredientname
    }


    def void setIngredienttype(int ingredientType){
        ingredienttype = ingredientType
    }

    def int getIngredienttype(){
        ingredienttype
    }

    @Override
    def boolean equals(Object o){
        Ingredient thatIngredient = null
        boolean theyAreTheSame = false

        try{
            thatIngredient = (Ingredient)o

        }catch(ClassCastException ce){
            return theyAreTheSame
        }

        if(this.id == thatIngredient.id){
            theyAreTheSame = true
        }

        return theyAreTheSame
    }
}
