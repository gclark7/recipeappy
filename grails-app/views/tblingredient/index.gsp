<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Ingredients</title>

    </head>
    <body>
        <div class="col-lg-12">
            <div class="indentMe">
                <div>
                <g:form controller="tblingredient" action="createIngredient" id="formcreateIngredient">
                    <label for="ingredientName">Ingredient
                    <g:textField name="ingredientName" id="ingredientName"></g:textField>
                    </label>
                    <label for="ingredientType">Type
                    %{--<g:select name="ingredientType" from="${types}" value="${types}"></g:select>--}%
                    <select id="ingredientType" name="ingredientType">
                        <g:each var="type" in="${types}">
                            <option value="${type.getId()}">${type.type}</option>
                        </g:each>
                    </select>


                    <g:submitButton name="createIngredient" id="createIngredient">Create Ingredient</g:submitButton>
                </g:form>
                </div>

                <g:each in="${ingredients}" var="ingredient">
                    <li>${ingredient.ingredientname} , ${ingredient.type}</li>
                </g:each>

                <div class="ingredientButton">
                    <span class="glyphicon glyphicon-folder-open"></span><button type="button" onclick="fnAlert()" >alert</button>
                </div>
            </div>
        </div>

    </body>
</html>
