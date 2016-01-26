package com.appcurious.recipeappy

class IngredientController {
    //static defaultAction = "index"

    def ingredientService
    def ingredienttypeService

    def ingredientType
    def ingredientName

    def index() {

        //works
        def ingredients = ingredientService.getIngredients()
        //System.out.println("entityservice:: " + ingredients)
        //def ingredientTypes = ingredienttypeService.getIngredientTypes()
        //def types =[]
        //for(Ingredienttype t:ingredientTypes){
        //    types.add(t.getType())
        //}
        def types = getIngredientTypes()
        return [ingredients:ingredients,types:types]
    }

    //controller actions cannot be overloaded
//    def createIngredient(String ingredientName, String ingredientType){
//        def ingredient = tblingredientService.createIngredient(ingredientName,ingredientType)
//        //render view:'index'//works but does not display ingredients
//        System.out.println(ingredientName + " , " + ingredientType)
//        def ingredients = tblingredientService.getIngredients()
//        def types = getIngredientTypes()
//        render(view:'index',model: [ingredients: ingredients,types:types] )
//    }
    def createIngredient(String ingredientName, int ingredientType){
    //def createIngredient(){
//        int intType
//        try{
//            intType = (int)ingredientType
//        }catch(ClassCastException ce){
//            intType = 0
//        }
        def ingredient = ingredientService.createIngredient(ingredientName,ingredientType)
        //render view:'index'//works but does not display ingredients
        System.out.println(ingredientName + " , " + ingredientType)

        def ingredients = ingredientService.getIngredients()
        def types = getIngredientTypes()
        render(view:'index',model: [ingredients: ingredients,types:types] )
    }

    def Ingredienttype[] getIngredientTypes(){
        def ingredientTypes = ingredienttypeService.getIngredientTypes()
//        def types =[]
//        for(Ingredienttype t:ingredientTypes){
//            types.add(t.getType())
//        }
        //types
        ingredientTypes
    }

    def editIngredient(int id,String ingredientName,int ingredientType){
        System.out.println(id)
        System.out.println(ingredientName)
        System.out.println(ingredientType)
        ingredientService.editIngredient(id,ingredientName,ingredientType)

    }







}
