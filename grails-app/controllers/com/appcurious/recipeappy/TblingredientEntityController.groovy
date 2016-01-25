package com.appcurious.recipeappy

class TblingredientEntityController {

    def tblingredientEntityService
    def index() {
        def ingredients = tblingredientEntityService.getIngredients()
        //def ingredients = tblingredientEntityService.createIngredient()
        System.out.println("entityservice:: " + ingredients)
        return [ingredients:ingredients]
    }
}
