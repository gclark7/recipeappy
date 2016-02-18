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
                <div class="indentMe">
                    <g:each in="${ingredients}" var="ingredient">
                        <li ng-click="editor.editIngredient('${ingredient.id}', '${ingredient.ingredientname}', '${ingredient.ingredienttype}')">
                        %{--<li ng-click="editIngredient('${ingredient}')">--}%
                        %{--<li>--}%

                            <label >${ingredient.ingredientname} , ${ingredient.ingredienttype}</label>
                            %{--<div id="updateIngredientPane" ng-hide="hideEdit" >--}%
                                %{--<g:form controller="ingredient" action="editIngredient" id="editIngredient">--}%
                                    %{--<g:textField readonly="readonly" name="ingredientId" id="ingredientId" value="${ingredient.id}" ></g:textField>--}%
                                    %{--<label for="ingredientName">Ingredient--}%
                                    %{--<g:textField name="ingredientName" id="ingredientName" value="${ingredient.ingredientname}"></g:textField>--}%
                                    %{--</label>--}%
                                    %{--<label for="ingredientType">Type--}%
                                    %{--<g:select name="ingredientType" from="${types}" value="${types}"></g:select>--}%
                                    %{--<select id="ingredientType" name="ingredientType" value="${ingredient.ingredienttype}">--}%
                                    %{--<g:each var="type" in="${types}">--}%
                                    %{--<option value="${type.getId()}">${type.type}</option>--}%
                                    %{--</g:each>--}%
                                    %{--</select>--}%


                                    %{--<g:submitButton name="Update Ingredient" id="btnUpdateIngredient"></g:submitButton>--}%
                                %{--</g:form>--}%
                                %{--<g:form controller="ingredient" action="editIngredient" id="editIngredient" >--}%
                                    %{--<g:textField readonly="readonly" name="ingredientId" id="ingredientId" ng-model="ingredientToEdit.id" ></g:textField>--}%
                                    %{--<g:textField name="ingredientName" id="ingredientName" ng-model="ingredientToEdit.ingredientname" ></g:textField>--}%
                                    %{--<select id="ingredientType" name="ingredientType" ng-model="ingredientToEdit.ingredienttype">--}%
                                        %{--<g:each var="type" in="${types}">--}%
                                        %{--<option value="${type.getId()}">${type.type}</option>--}%
                                        %{--</g:each>--}%
                                    %{--</select>--}%

                                    %{--<g:submitButton name="Save Change" id="btnEditIngredient"></g:submitButton>--}%
                                %{--</g:form>--}%
                            %{--</div>--}%

                            %{--<input type="submit" ng-hide="hideEdit" name="Update Ingredient" id="updateIngredient" value="Save Change"/>--}%
                            %{--<input type="button" ng-click="toggleHideEdit()" value="Edit Ingredient"/>--}%
                            %{--<input type="button" ng-click="editIngredient('${ingredient.id}', '${ingredient.ingredientname}', '${ingredient.ingredienttype}')"--}%
                                   %{--value="Edit Ingredient"/>--}%
                        </li>
                    </g:each>
                </div>

            %{--<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Modal</button>--}%
            %{--<div class="modal fade" id="myModal" role="dialog">--}%
                %{--<div class="modal-dialog">--}%

                    %{--<!-- Modal content-->--}%
                    %{--<div class="modal-content">--}%
                        %{--<div class="modal-header">--}%
                            %{--<button type="button" class="close" data-dismiss="modal">&times;</button>--}%
                            %{--<h4 class="modal-title">Modal Header</h4>--}%
                        %{--</div>--}%
                        %{--<div class="modal-body">--}%
                            %{--<p>Some text in the modal.</p>--}%
                        %{--</div>--}%
                        %{--<div class="modal-footer">--}%
                            %{--<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>--}%
                        %{--</div>--}%
                    %{--</div>--}%

                %{--</div>--}%
            %{--</div>--}%


                <script type="text/ng-template" id="editIngredientModal.html">
                    <div class="modal-header">
                        edit ingredient
                    </div>
                    <div class="modal-body">
                        <g:form controller="ingredient" action="editIngredient" id="editIngredient" >
                            <g:textField readonly="readonly" name="ingredientId" id="ingredientId" ng-model="ingredientToEdit.id" ></g:textField>
                            <g:textField name="ingredientName" id="ingredientName" ng-model="ingredientToEdit.ingredientname" ></g:textField>
                            <select id="ingredientType" name="ingredientType" ng-model="ingredientToEdit.ingredienttype">
                                <g:each var="type" in="${types}">
                                    <option value="${type.getId()}">${type.type}</option>
                                </g:each>
                            </select>
                            <g:submitButton name="Save Change" id="btnEditIngredient" ng-click="ok()"></g:submitButton>
                        </g:form>
                        <div><input type="button" ng-click="cancel()" value="cancel"/></div>
                    </div>


                </script>

                    <div class="ingredientButton">
                        <span class="glyphicon glyphicon-folder-open"></span><button type="button" onclick="fnAlert()" >alert</button>
                    </div>

            %{--</div>--}%
        </div>


    </body>
</html>
