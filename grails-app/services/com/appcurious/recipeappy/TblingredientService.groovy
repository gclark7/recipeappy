package com.appcurious.recipeappy

import grails.transaction.Transactional
import org.grails.datastore.mapping.core.EntityCreationException


@Transactional
class TblingredientService {
    //def ingredienttypeService
    def Tblingredient[] getIngredients(){

        def ingredients = Tblingredient.findAll()
        ingredients
    }

//    def Ingredienttype[] getIngredientTypes(){
//        def types = ingredienttypeService.getIngredientTypes()
//        types
//    }

    def Tblingredient createIngredient(){
        def ingredient = new Tblingredient()
        ingredient.setIngredientname("made from idea")
        ingredient.save()
        ingredient
    }

//    def Tblingredient createIngredient(String ingredientName, String type){
//        def ingredient = new Tblingredient()
//        if(ingredientName) {
//            ingredient.setIngredientname(ingredientName)
//            ingredient.setType(type)
//            ingredient.save()
//        }else{
//            ingredient.setIngredientname("notSaved...NoName")
//        }
//        ingredient
//    }

    def Tblingredient createIngredient(String ingredientName, int ingredientType){
        def ingredient = new Tblingredient()
        if(ingredientName) {
            ingredient = new Tblingredient(ingredientName,ingredientType)
//            ingredient.setIngredientname(ingredientName)
//            ingredient.setIngredienttype(type)
            try{
                ingredient.save()
                System.out.println("saved " + ingredient)
            }catch(Exception c){
                System.out.println(ingredient + " did not save")
            }

        }else{
            ingredient.setIngredientname("notSaved...NoName")
            System.out.println("no Name")
        }
        ingredient
    }

    def Tblingredient editIngredient(Tblingredient ingredient){
        //def ingredient = new Tblingredient().setIngredientname("notSaved")
        if(ingredient.ingredientname) {
            ingredient.save()
        }
        ingredient
    }

    def Tblingredient getIngredientById(int id){
        def ingredient = Tblingredient.findById(id)
        def tempName = "did not find " + id
        if(!ingredient){
            ingredient = new Tblingredient(tempName,"notFound")
        }
        ingredient
    }

//    def Ingredienttype createIngredientType(String type){
//        def ingredientType = ingredienttypeService.createIngredientType(type)
//        ingredientType.save()
//        ingredientType
//    }
}
