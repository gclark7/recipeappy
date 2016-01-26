package com.appcurious.recipeappy

import grails.transaction.Transactional

@Transactional
class IngredientService {
    //def ingredienttypeService
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
                System.out.println(ingredient.toString())
            }

        }else{
            ingredient.setIngredientname("notSaved...NoName")
            System.out.println("no Name")
        }
        ingredient
    }

    def Ingredient editIngredient(int id,String ingredientName,int ingredientType){

        System.out.println(id)
        System.out.println(ingredientName)
        System.out.println(ingredientType)
        def ingredient = getIngredientById(id) //Ingredient.findById(id:id)//


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
        System.out.println(ingredient.ingredientname)
        if(!ingredient){
            ingredient = new Ingredient()
            ingredient.setIngredientname(tempName)
            System.out.println(tempName)
        }
        ingredient
    }

}
