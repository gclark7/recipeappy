package com.appcurious.recipeappy

import grails.transaction.Transactional

@Transactional
class TblingredientEntityService {


    def serviceMethod() {

    }

    TblingredientEntity[] getIngredients(){

        def ingredients = new TblingredientEntity().findAll()
        ingredients
    }

    TblingredientEntity createIngredient(){
        def ingredient = new TblingredientEntity()
        ingredient.setIngredientname("made from idea")
        ingredient.save()
        ingredient
    }
}
