package com.appcurious.recipeappy

class IngredienttypeController {
    def ingredienttypeService
    def index() {
        def types = ingredienttypeService.getIngredientTypes()
        return [types:types]
    }

    def createIngredientType(String type) {
        def ingredienttype = ingredienttypeService.createIngredientType(type)

        def types = ingredienttypeService.getIngredientTypes()
        render(view: 'index', model: [types: types])
    }


}
