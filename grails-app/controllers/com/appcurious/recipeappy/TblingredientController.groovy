package com.appcurious.recipeappy

class TblingredientController {
    //static defaultAction = "index"

    def tblingredientService
    def ingredienttypeService


    def index() {

        //works
        def ingredients = tblingredientService.getIngredients()
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
//        int intType
//        try{
//            intType = (int)ingredientType
//        }catch(ClassCastException ce){
//            intType = 0
//        }
        def ingredient = tblingredientService.createIngredient(ingredientName,ingredientType)
        //render view:'index'//works but does not display ingredients
        System.out.println(ingredientName + " , " + ingredientType)

        def ingredients = tblingredientService.getIngredients()
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







}
