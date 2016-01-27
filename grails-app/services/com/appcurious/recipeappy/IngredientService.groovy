package com.appcurious.recipeappy

import grails.transaction.Transactional
import java.util.logging.*

@Transactional
class IngredientService {
    //def ingredienttypeService
    def Logger log = Logger.getLogger("IngredientService").setLevel(Level.ALL)



    def Ingredient[] getIngredients(){

        def ingredients = Ingredient.findAll()
        ingredients
    }


    def Ingredient createIngredient(){
        def ingredient = new Ingredient()
        ingredient.setIngredientname("made from app")
        ingredient.save()
        ingredient
    }

    def Ingredient createIngredient(String ingredientName, int ingredientType){
        def ingredient = new Ingredient()
        if(ingredientName) {
            ingredient.setIngredientname(ingredientName)
            ingredient.setIngredienttype(ingredientType)
            try{
                ingredient.save()
                //System.out.println("saved " + ingredient)
                //System.out.println(ingredient.errors.allErrors())
            }catch(Exception c){
                //log.info(c + ", " + ingredient.toString() )
                //System.out.println(ingredient.toString())
            }

        }else{
            ingredient.setIngredientname("notSaved...NoName")
            //log.info("no Name")
        }
        ingredient
    }

    def Ingredient editIngredient(int ingredientId, String ingredientName, int ingredientType){
        def showMe = "id::" + ingredientId
        System.out.println(showMe)
        //log.info(id.toString())
        //log.info(ingredientName)
        //log.info(ingredientType)
        def ingredient = getIngredientById(ingredientId) //Ingredient.findById(id:id)//


        if(ingredientName) {
            ingredient.setIngredientname(ingredientName)
            ingredient.setIngredienttype(ingredientType)
            ingredient.save()

        }
        ingredient
    }

    def Ingredient getIngredientById(int id){
        def ingredient = Ingredient.findById(id)
        def tempName = "did not find " + id

        if(!ingredient){
            ingredient = new Ingredient()
            ingredient.setIngredientname(tempName)
            //log.info("no ingredient " + tempName)
            System.out.println("no ingredient " + tempName)
        }else{
            //log.info(ingredient.getIngredientname())

        }
        ingredient
    }

}
