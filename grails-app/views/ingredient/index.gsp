<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Ingredients</title>

    </head>
    <body>
        <div class="col-lg-12" ng-controller="manageIngredients">

                <div id="createIngredientPane">
                    <g:form controller="ingredient" action="createIngredient" id="createIngredient" >
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


                        <g:submitButton name="Create Ingredient" id="btnCreateIngredient">Create Ingredient</g:submitButton>

                    </g:form>

                </div>
                %{--<div id="updateIngredientPane">--}%
                    %{--<g:form controller="ingredient" action="" id="editIngredient">--}%
                        %{--<label for="ingredientName">Ingredient--}%
                        %{--<g:textField name="ingredientName" id="ingredientName"></g:textField>--}%
                        %{--</label>--}%
                        %{--<label for="ingredientType">Type--}%
                    %{--<g:select name="ingredientType" from="${types}" value="${types}"></g:select>--}%
                        %{--<select id="ingredientType" name="ingredientType">--}%
                            %{--<g:each var="type" in="${types}">--}%
                                %{--<option value="${type.getId()}">${type.type}</option>--}%
                            %{--</g:each>--}%
                        %{--</select>--}%


                        %{--<g:submitButton name="Update Ingredient" id="btnUpdateIngredient"></g:submitButton>--}%
                    %{--</g:form>--}%
                %{--</div>--}%
                <g:each in="${ingredients}" var="ingredient">
                    <li ng-click="editIngredient('${ingredient.id}', '${ingredient.ingredientname}', '${ingredient.ingredienttype}')">

                        <label ng-hide="!hideEdit">${ingredient.ingredientname} , ${ingredient.ingredienttype}</label>


                        %{--<input type="submit" ng-hide="hideEdit" name="Update Ingredient" id="updateIngredient" value="Save Change"/>--}%
                        %{--<input type="button" ng-click="toggleHideEdit()" value="Edit Ingredient"/>--}%
                    </li>
                </g:each>

                <div ng-hide="hideEdit">
                    <g:form controller="ingredient" action="editIngredient" id="editIngredient" >
                        <g:textField name="id" id="id" ng-model="editId"></g:textField>
                        <g:textField name="ingredientName" id="ingredientName" ng-model="newName"></g:textField>
                        <g:textField name="ingredientType" id="ingredientType" ng-model="newType"></g:textField>
                        <g:submitButton name="Save Change" id="btnEditIngredient"></g:submitButton>
                    </g:form>
                </div>

                    <div class="ingredientButton">
                        <span class="glyphicon glyphicon-folder-open"></span><button type="button" onclick="fnAlert()" >alert</button>
                    </div>

            </div>
        </div>

    </body>
</html>
