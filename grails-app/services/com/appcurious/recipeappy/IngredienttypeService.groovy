package com.appcurious.recipeappy

import grails.transaction.Transactional

@Transactional
class IngredienttypeService {

    def serviceMethod() {

    }

    def Ingredienttype createIngredientType(String type){
        def ingredienttype = new Ingredienttype(type)
        ingredienttype.save()
        ingredienttype
    }

    def Ingredienttype[] getIngredientTypes(){
        def types = Ingredienttype.findAll()
        types
    }
}
