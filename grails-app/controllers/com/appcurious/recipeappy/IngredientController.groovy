package com.appcurious.recipeappy
import java.util.logging.*
class IngredientController {
    //static defaultAction = "index"
    //def Logger log = Logger.getLogger(IngredientController.getClass().getName()).setLevel(Level.ALL)
    def ingredientService
    def ingredienttypeService

//    def id
//    def ingredientType
//    def ingredientName




    def index() {

        //works
        def ingredients = ingredientService.getIngredients()
        def types = getIngredientTypes()
        return [ingredients:ingredients,types:types]
    }


    def createIngredient(){
        String ingredientName = params.ingredientName
        int ingredientType = Integer.parseInt(params.ingredientType)

        def ingredient = ingredientService.createIngredient(ingredientName,ingredientType)
        //render view:'index'//works but does not display ingredients
//        System.out.println(ingredientName + " , " + ingredientType)
        log.info(ingredientName + ", " + ingredientType)

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

    def editIngredient(){
        int ingredientId = Integer.parseInt(params.ingredientId)
        String ingredientName = params.ingredientName
        int ingredientType = Integer.parseInt(params.ingredientType)
        System.out.println(params.ingredientId)

    //def editIngredient(){
        //log.info(id.toString())
        //log.info(ingredientName)
        //log.info(ingredientType.toString())
        ingredientService.editIngredient(ingredientId,ingredientName,ingredientType)

        def ingredients = ingredientService.getIngredients()
        def types = getIngredientTypes()
        render(view:'index',model: [ingredients: ingredients,types:types] )

    }







}
